## 自动化框架

### junit5
[junit5官方文档](https://junit.org/junit5/docs/current/user-guide/)

> JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage

【踩坑】用IDEA注意添加下面的依赖,注意版本匹配
[链接](https://junit.org/junit5/docs/current/user-guide/#running-tests-ide-intellij-idea)

```
<!-- Only needed to run tests in a version of IntelliJ IDEA that bundles older versions -->
<dependency>
    <groupId>org.junit.platform</groupId>
    <artifactId>junit-platform-launcher</artifactId>
    <version>1.7.0</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.7.0</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.vintage</groupId>
    <artifactId>junit-vintage-engine</artifactId>
    <version>5.7.0</version>
    <scope>test</scope>
</dependency>
```

maven依赖（junit5）
```
<build>
    <plugins>
        <plugin>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.22.2</version>
        </plugin>
        <plugin>
            <artifactId>maven-failsafe-plugin</artifactId>
            <version>2.22.2</version>
        </plugin>
    </plugins>
</build>
<!-- ... -->
<dependencies>
    <!-- ... -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.7.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.7.0</version>
        <scope>test</scope>
    </dependency>
    <!-- ... -->

    <!-- 如果还需要使用junt4，请使用可以继续添加 -->
    <!--dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13</version>
        <scope>test</scope>
    </dependency-->
</dependencies>
<!-- ... -->
```

注解使用

| 注解                     | 描述                                                         |
| :----------------------- | :----------------------------------------------------------- |
| `@Test`                  | 表示方法是测试方法。与JUnit 4的`@Test`注释不同，此注释不声明任何属性，因为JUnit Jupiter中的测试扩展基于其自己的专用注释进行操作。除非*重写*这些方法，否则它们将*被**继承*。 |
| `@ParameterizedTest`     | 表示方法是[参数化测试](https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests)。除非*重写*这些方法，否则它们将*被**继承*。 |
| `@RepeatedTest`          | 表示方法是[重复测试](https://junit.org/junit5/docs/current/user-guide/#writing-tests-repeated-tests)的测试模板。除非*重写*这些方法，否则它们将*被**继承*。 |
| `@TestFactory`           | 表示方法是用于[动态测试](https://junit.org/junit5/docs/current/user-guide/#writing-tests-dynamic-tests)的测试工厂。除非*重写*这些方法，否则它们将*被**继承*。 |
| `@TestTemplate`          | 表示方法是[测试用例](https://junit.org/junit5/docs/current/user-guide/#writing-tests-test-templates)的[模板，测试用例](https://junit.org/junit5/docs/current/user-guide/#writing-tests-test-templates)设计为根据已注册[提供程序](https://junit.org/junit5/docs/current/user-guide/#extensions-test-templates)返回的调用上下文的数量来多次调用。除非*重写*这些方法，否则它们将*被**继承*。 |
| `@TestMethodOrder`       | 用于为带注释的测试类配置[测试方法的执行顺序](https://junit.org/junit5/docs/current/user-guide/#writing-tests-test-execution-order)；类似于JUnit 4的`@FixMethodOrder`。这样的注释是*继承的*。 |
| `@TestInstance`          | 用于为带注释的测试类配置[测试实例生命周期](https://junit.org/junit5/docs/current/user-guide/#writing-tests-test-instance-lifecycle)。这样的注释是*继承的*。 |
| `@DisplayName`           | 声明测试类或测试方法的自定义[显示名称](https://junit.org/junit5/docs/current/user-guide/#writing-tests-display-names)。这样的注释不是*继承的*。 |
| `@DisplayNameGeneration` | 声明测试类的自定义[显示名称生成器](https://junit.org/junit5/docs/current/user-guide/#writing-tests-display-name-generator)。这样的注释是*继承的*。 |
| `@BeforeEach`            | 表示该注释的方法应该被执行*之前* **的每个** `@Test`，`@RepeatedTest`，`@ParameterizedTest`，或`@TestFactory`方法在当前类; 类似于JUnit 4的`@Before`。除非*重写*这些方法，否则它们将*被**继承*。 |
| `@AfterEach`             | 表示该注释的方法应该被执行*之后* **每个** `@Test`，`@RepeatedTest`，`@ParameterizedTest`，或`@TestFactory`方法在当前类; 类似于JUnit 4的`@After`。除非*重写*这些方法，否则它们将*被**继承*。 |
| `@BeforeAll`             | 表示该注释的方法应该被执行*之前* **所有** `@Test`，`@RepeatedTest`，`@ParameterizedTest`，和`@TestFactory`方法在当前类; 类似于JUnit 4的`@BeforeClass`。此类方法是*继承的*（除非它们被*隐藏*或*覆盖*），并且必须被*继承*（除非`static`使用“每类”[测试实例生命周期](https://junit.org/junit5/docs/current/user-guide/#writing-tests-test-instance-lifecycle)）。 |
| `@AfterAll`              | 表示该注释的方法应该被执行*之后* **的所有** `@Test`，`@RepeatedTest`，`@ParameterizedTest`，和`@TestFactory`方法在当前类; 类似于JUnit 4的`@AfterClass`。此类方法是*继承的*（除非它们被*隐藏*或*覆盖*），并且必须被*继承*（除非`static`使用“每类”[测试实例生命周期](https://junit.org/junit5/docs/current/user-guide/#writing-tests-test-instance-lifecycle)）。 |
| `@Nested`                | 表示带注释的类是一个非静态的[嵌套测试类](https://junit.org/junit5/docs/current/user-guide/#writing-tests-nested)。`@BeforeAll`和`@AfterAll`方法不能直接在使用`@Nested`测试类除非“每级”[测试实例的生命周期](https://junit.org/junit5/docs/current/user-guide/#writing-tests-test-instance-lifecycle)被使用。这样的注释不是*继承的*。 |
| `@Tag`                   | 用于在类或方法级别上声明[用于过滤测试的标签](https://junit.org/junit5/docs/current/user-guide/#writing-tests-tagging-and-filtering)；类似于TestNG中的测试组或JUnit 4中的类别。此类注释在类级别*继承*，而不在方法级别*继承*。 |
| `@Disabled`              | 用于[禁用](https://junit.org/junit5/docs/current/user-guide/#writing-tests-disabling)测试类或测试方法；类似于JUnit 4的`@Ignore`。这样的注释不是*继承的*。 |
| `@Timeout`               | 如果执行超过给定的持续时间，则使测试，测试工厂，测试模板或生命周期方法失败。这样的注释是*继承的*。 |
| `@ExtendWith`            | 用于[声明性](https://junit.org/junit5/docs/current/user-guide/#extensions-registration-declarative)地[注册扩展](https://junit.org/junit5/docs/current/user-guide/#extensions-registration-declarative)。这样的注释是*继承的*。 |
| `@RegisterExtension`     | 用于通过字段以[编程](https://junit.org/junit5/docs/current/user-guide/#extensions-registration-programmatic)方式[注册扩展](https://junit.org/junit5/docs/current/user-guide/#extensions-registration-programmatic)。除非被*遮盖，*否则这些字段将被*继承*。 |
| `@TempDir`               | 用于通过生命周期方法或测试方法中的字段注入或参数注入来提供[临时目录](https://junit.org/junit5/docs/current/user-guide/#writing-tests-built-in-extensions-TempDirectory)；位于`org.junit.jupiter.api.io`包装中。 |


### 测试报告：allure
[allure官方文档](https://docs.qameta.io/allure/)

启动allure服务: `allure serve target/allure-results`

注解的使用

```
@Description  描述性注解
@Step  （@Step注解可以对参数化进行检查）
@Stories/@Story （该注解可以管理同一模块，及分组展示）
@Severity注解（@Severity注解：测试的严重程度划分BLOCKER，CRITICAL，NORMAL，MINOR，TRIVIAL。通过查看此信息，我们可以了解测试失败的严重性。）
@Epic注解（在敏捷中，测试也可以按Epic，Theme和story进行分类，allure中也可以这样标注映射关系）
@Links注解（@Links可以将测试链接到某些资源，例如TMS（测试管理系统）或错误跟踪器等
@Attachment注解（@Attachment该方法返回String或byte []，应将其添加到报表中。我们可以使用该注解将异常屏幕截图作为附件展示）
```

### maven
常见mvn命令
```
mvn compile 编译源代码
mvn test-compile 编译测试代码
mvn test 运行测试
mvn clean 清除项目的生成结果
mvn package 打包项目生成jar/war文件
mvn install 安装jar至本地库
mvn archetype:generate 反向生成maven项目的骨架
mvn -Dtest package 只打包不测试
mvn jar:jar 只打jar包
mvn test -skipping compile -skipping test-compile 只测试不编译也不编译测试
mvn eclipse:clean 清除eclipse的一些系统设置
mvn dependency:list 查看当前项目已被解析的依赖
mvn clean install -U 强制检查更新
mvn verify 运行任何检查，验证包是否有效且达到质量标准
-Dmaven.test.skip=true 跳过测试
-Dmaven.test.failure.ignore=true 忽略测试失败
```

执行单条测试用例： `mvn clean test -Dtest=TestCtripHotel`

