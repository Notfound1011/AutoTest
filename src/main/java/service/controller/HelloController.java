package service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger( HelloController.class );

    @Value( "${server.port}" )
    String port;

    @RequestMapping("/")
    public String helloworld(){
        return "Hello World3";
    }

    @RequestMapping("/hi")
    public String hi(@RequestParam(value="name") String name) {

        logger.debug( "debug log..." );
        logger.info( "info log..." );
        logger.warn( "warn log..." );

        return "hi " + name + " ,i am from port:" + port;
    }
}
