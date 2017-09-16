package spring.extend.test.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * Created by javen on 2017/8/9.
 * <p>
 * 比BeanFactoryPostProcessor接口类优先
 * 具体执行需调试查看
 * </p>
 */
@Component
public class TestBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        System.out.println(this.getClass().getName() + " -> " + "postProcessBeanDefinitionRegistry");
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println(this.getClass().getName() + " -> " + "postProcessBeanDefinitionRegistry");
    }

    public int getOrder() {
        return 0;
    }
}
