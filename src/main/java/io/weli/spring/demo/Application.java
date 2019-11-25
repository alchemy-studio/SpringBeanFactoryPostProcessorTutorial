package io.weli.spring.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// http://zetcode.com/spring/beanfactorypostprocessor/
// $ mvn -q exec:java
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        // https://www.logicbig.com/how-to/code-snippets/jcode-spring-framework-beanfactorypostprocessor.html
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        logger.info("{}", ctx.getBean("myBean"));

        ctx.close();
    }

}
