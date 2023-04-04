package dev.elma.dao;

import org.springframework.stereotype.Component;

@Component("daov1")
public class IDAOImplV1 implements IDAO{
    @Override
    public double getData() {
        System.out.println("Class DAO V1");
        double data=123;
        return data;
    }
}
