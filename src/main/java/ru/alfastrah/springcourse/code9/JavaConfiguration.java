package ru.alfastrah.springcourse.code9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfiguration {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Lazy
    JavaBean javaBean(Service service) {
        JavaBean javaBean = new JavaBean("job from constructor");
        javaBean.setService(service);
        return javaBean;
    }
    @Bean
    @Scope("prototype")
    Service service() {
        return new Service("ONE");
    }
}