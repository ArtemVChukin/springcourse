package ru.alfastrah.springcourse.code9;

class Service {
    String name;

    public Service(String name) {
        this.name = name;
    }

    String getSomeService() {
        return String.format(
                "service %s", name);
    }
}
