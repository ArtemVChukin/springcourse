package ru.alfastrah.springcourse.code8;

class XMLBean {
    Service service;
    String jobName;

    XMLBean(String jobName) {
        this.jobName = jobName;
    }

    void init() {
        System.out.println("init");
    }

    void destroy() {
        System.out.println("destroy");
    }

    public void setService(Service service) {
        this.service = service;
    }

    void doJob() {
        System.out.format("%s using %s done\n",
                jobName, service.getSomeService());
    }
}
