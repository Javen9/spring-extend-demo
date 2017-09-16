package spring.extend.test.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by javen on 2017/8/10.
 */
@Configuration
public class TestConfiguration {

    public TestConfiguration() {
        System.out.println("TestConfiguration");
    }

    /**
     * <p>
     * spring扫描会将@Bean的方法当做工厂方法，所属类为工厂类去创建bean
     * 相当于我们以xml文件配置生成bean时指定工厂方法一样
     * </p>
     *
     * @return
     */
    @Bean("testBean")
    public TestBean getTestBean() {
        return new TestBean();
    }
}
