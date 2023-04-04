package dev.elma.view;

import dev.elma.dao.IDAO;
import dev.elma.services.IServices;
import dev.elma.services.IServicesImpl;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class IOC_IOD_FromScratche_Dynamic {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        Class daoClass=Class.forName(scanner.nextLine());
        IDAO o =(IDAO) daoClass.getConstructor().newInstance();
        System.out.println(o.getData());

        Class serviceClass=Class.forName(scanner.nextLine());
         IServices service =(IServices) serviceClass.getConstructor().newInstance();
        Method setDao = serviceClass.getMethod("setDao", IDAO.class);
        setDao.invoke(service,o);

        System.out.println(service.calculate());

    }
}
