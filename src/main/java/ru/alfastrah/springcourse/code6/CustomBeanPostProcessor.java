package ru.alfastrah.springcourse.code6;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    public CustomBeanPostProcessor() {
        System.out.println("Bean constructor");
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.printf("postProcessBeforeInitialization class=%s, name=%s\n",
                bean.getClass(), beanName);
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.printf("postProcessAfterInitialization class=%s, name=%s\n",
                bean.getClass(), beanName);
        return bean;
    }
}
