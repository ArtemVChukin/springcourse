package ru.alfastrah.springcourse.code6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainPostProcessor {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        "ru.alfastrah.springcourse.code6");
        context.getBean(Bean.class).saySomething();
    }
}
