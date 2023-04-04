package dev.elma.dao;

public class IDAOImplV1 extends IDAO{
    @Override
    public double getData() {
        System.out.println("Class DAO V1");
        double data=123;
        return data;
    }
}
