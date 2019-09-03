package ru.alfastrah.springcourse.code4;

import org.springframework.stereotype.Component;

@Component
class Service {
    static int i = 0;

    Service() {
        i++;
    }

    String getSomeService() {
        return String.format(
                "service %d got!", i);
    }

}

