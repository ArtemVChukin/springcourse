package ru.alfastrah.springcourse.code3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Client {
    @Autowired
    Service service;

    void clientJob() {
        System.out.println(service.getSomeService());
    }
}
