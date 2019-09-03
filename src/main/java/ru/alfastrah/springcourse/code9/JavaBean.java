package ru.alfastrah.springcourse.code9;

class JavaBean {
    Service service;
    String jobName;

    JavaBean(String jobName) {
        this.jobName = jobName;
    }

    void init() {
        System.out.println("init");
    }

    void destroy() {
        System.out.println("destroy");
    }

    void setService(Service service) {
        this.service = service;
    }

    void doJob() {
        System.out.format("%s using %s done\n",
                jobName, service.getSomeService());
    }
}
