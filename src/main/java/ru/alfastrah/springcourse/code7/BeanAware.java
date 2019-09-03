package ru.alfastrah.springcourse.code7;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanAware implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        System.out.println(beanFactory.getClass().getName());
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        System.out.println(applicationContext.getClass().getName());
    }
}
