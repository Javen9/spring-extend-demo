package spring.extend.test.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * Created by javen on 2017/8/9.
 * 具体执行需调试查看
 */
@Component
public class TestInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    public Object postProcessBeforeInstantiation(Class<?> aClass, String s) throws BeansException {
        return null;
    }

    public boolean postProcessAfterInstantiation(Object o, String s) throws BeansException {
        return true;
    }

    public PropertyValues postProcessPropertyValues(PropertyValues propertyValues, PropertyDescriptor[] propertyDescriptors, Object o, String s) throws BeansException {
        return propertyValues;
    }

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
