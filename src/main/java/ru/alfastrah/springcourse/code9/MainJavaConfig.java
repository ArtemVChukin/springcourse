package ru.alfastrah.springcourse.code9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfiguration.class);
        context.getBean(JavaBean.class).doJob();
        context.close();
    }
}

