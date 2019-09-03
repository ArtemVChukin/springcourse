package ru.alfastrah.springcourse.lab;

class BeanUser {
    SuperBean annotationBean;
    SuperBean javaBean;
    SuperBean xmlbean;

    void doJob() {
        System.out.printf("%s -> %s -> %s",
                annotationBean.done(), javaBean.done(), xmlbean.done());
    }
}
