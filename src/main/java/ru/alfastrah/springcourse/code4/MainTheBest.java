package ru.alfastrah.springcourse.code4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTheBest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("ru.alfastrah.springcourse.code4");
        applicationContext.getBean(Client.class).clientJob();
        applicationContext.getBean(Client.class).clientJob();
    }
}
