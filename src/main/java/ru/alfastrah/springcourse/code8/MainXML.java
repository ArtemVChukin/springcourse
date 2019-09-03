package ru.alfastrah.springcourse.code8;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainXML {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext("bean_code8.xml");
        context.getBean(XMLBean.class).doJob();
        context.close();
    }
}
