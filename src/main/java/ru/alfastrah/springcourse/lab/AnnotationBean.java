package ru.alfastrah.springcourse.lab;

class AnnotationBean implements SuperBean {
    @Override
    public String done() {
        return "annotationBean";
    }
}
