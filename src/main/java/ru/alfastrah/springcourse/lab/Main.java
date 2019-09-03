package ru.alfastrah.springcourse.lab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        "ru.alfastrah.springcourse.lab");
        context.getBean(BeanUser.class).doJob();
        context.close();
    }
}
