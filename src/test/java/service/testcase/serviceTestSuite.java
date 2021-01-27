package service.testcase;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("JUnit Platform Suite Demo")
@SelectPackages({"service.testcase.ctripHotel","service.testcase.department"})  // 指定包名
@SelectClasses({service.testcase.ctripHotel.TestCtripHotel.class,service.testcase.department.TestDepartment.class}) //指定类名,多个则传列表
public class serviceTestSuite {
}