package ru.alfastrah.springcourse.code5;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringLyfeCycle implements InitializingBean, DisposableBean {
    @PostConstruct
    public void init() {
        System.out.println("PostConstruct");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("afterPropertiesSet");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("PreDestroy");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}

