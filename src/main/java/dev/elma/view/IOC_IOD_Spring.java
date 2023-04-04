package dev.elma.view;

import dev.elma.services.IServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOC_IOD_Spring {
    public static void main(String[] args) {
        //load config file and create spring app...
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("configSp.xml");
        //getBeans ==> getObject that's have 'service1' as Name
        IServices service=(IServices) applicationContext.getBean("service1");
    }
}
