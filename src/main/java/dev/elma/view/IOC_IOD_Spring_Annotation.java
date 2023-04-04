package dev.elma.view;

import dev.elma.services.IServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOC_IOD_Spring_Annotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("dev.elma.dao","dev.elma.services");
        IServices bean = applicationContext.getBean(IServices.class);
        System.out.println(bean.calculate());
    }
}
