package dev.elma.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOC_IOD_Spring {
    public static void main(String[] args) {
        //System.out.println(IOC_IOD_Spring.class.getResource("config"));
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("configSp.xml");
        System.out.println(applicationContext.getBean("service1"));
    }
}
