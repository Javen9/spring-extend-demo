package spring.extend.test.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Created by javen on 2017/8/9.
 * <p>
 * spring容器在调用postProcessBeanFactory之前会扫描所有注解bean，获取BeanFactoryPostProcessor类型的bean定义并实例化，
 * 但是不会加到ApplicationContext.beanFactoryPostProcessors列表里面，因为它只会在容器启动时调用一次
 * 具体执行需调试查看
 * </p>
 */
@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println(this.getClass().getName() + " -> " + "postProcessBeanFactory");
    }
}
