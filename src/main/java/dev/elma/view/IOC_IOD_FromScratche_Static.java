package dev.elma.view;

import dev.elma.dao.IDAOImplV1;
import dev.elma.services.IServicesImpl;

public class IOC_IOD_FromScratche_Static {
    public static void main(String[] args) {
        //create object static
        IServicesImpl service1=new IServicesImpl();
        service1.setDao(new IDAOImplV1());
        System.out.println(service1.calculate());
    }
}
