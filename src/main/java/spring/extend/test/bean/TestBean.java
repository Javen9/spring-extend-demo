package spring.extend.test.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * Created by javen on 2017/8/9.
 */
//@Component
public class TestBean implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, EnvironmentAware, EmbeddedValueResolverAware, ResourceLoaderAware, ApplicationEventPublisherAware, MessageSourceAware, ApplicationContextAware {

    public void setBeanName(String s) {
        System.out.println(this.getClass().getName() + " -> " + "setBeanName");
    }

    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println(this.getClass().getName() + " -> " + "setBeanClassLoader");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(this.getClass().getName() + " -> " + "setBeanFactory");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getName() + " -> " + "afterPropertiesSet");
    }

    public void setEnvironment(Environment environment) {
        System.out.println(this.getClass().getName() + " -> " + "setEnvironment");
    }

    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        System.out.println(this.getClass().getName() + " -> " + "setEmbeddedValueResolver");
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println(this.getClass().getName() + " -> " + "setResourceLoader");
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        System.out.println(this.getClass().getName() + " -> " + "setApplicationEventPublisher");
    }

    public void setMessageSource(MessageSource messageSource) {
        System.out.println(this.getClass().getName() + " -> " + "setMessageSource");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(this.getClass().getName() + " -> " + "setApplicationContext");
    }
}
