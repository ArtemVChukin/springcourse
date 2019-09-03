package ru.alfastrah.springcourse.code5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLyfeCycle {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("ru.alfastrah.springcourse.code5");
        applicationContext.getBean(SpringLyfeCycle.class);
        applicationContext.close();
    }
}
