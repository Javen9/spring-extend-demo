package spring.extend.test.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by javen on 2017/8/9.
 * 只能通过spring.factories配置才有效
 */
public class TestApplicationContextInitializer implements ApplicationContextInitializer {
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println(this.getClass().getName() + " -> " + "initialize");
    }
}
