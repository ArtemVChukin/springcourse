package ru.alfastrah.springcourse.code10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Lazy;

@Configuration
@ImportResource("classpath:bean_code10.xml")
public class JavaConfiguration {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Lazy
    JavaBean javaBean(Service service) {
        JavaBean javaBean = new JavaBean("job from constructor");
        javaBean.setService(service);
        return javaBean;
    }
}
