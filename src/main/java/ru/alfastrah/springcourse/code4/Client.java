package ru.alfastrah.springcourse.code4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Client {
    static int i = 0;
    @Autowired
    Service service;

    Client() {
        i++;
    }

    void setService(Service service) {
        this.service = service;
    }

    void clientJob() {
        System.out.println(String.format("Client %d, %s",
                i, service.getSomeService()));
    }
}
