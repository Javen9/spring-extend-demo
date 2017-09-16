package spring.extend.test.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by javen on 2017/8/9.
 * <p>
 * spring容器在启动时会先获取BeanPostProcessor类型的bean定义并实例化，
 * 同时会添加到工厂beanPostProcessors列表里面，为后续创建bean调用做准备
 * 具体执行需调试查看
 * </p>
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
