package ru.alfastrah.springcourse.code6;

import org.springframework.stereotype.Component;

@Component
class Bean {
    void saySomething() {
        System.out.println("Hello!");
    }
}
