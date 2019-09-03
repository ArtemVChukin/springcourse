package ru.alfastrah.springcourse.code3;

import org.springframework.stereotype.Component;

@Component
class Service {
    String getSomeService() {
        return "service got!";
    }
}

