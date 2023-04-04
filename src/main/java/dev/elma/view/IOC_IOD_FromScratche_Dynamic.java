package dev.elma.view;

import dev.elma.dao.IDAO;

import java.io.File;
import java.util.Scanner;

public class IOC_IOD_FromScratche_Dynamic {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        Class daoClass=Class.forName(scanner.nextLine());
        IDAO o =(IDAO) daoClass.getConstructor().newInstance();
        System.out.println(o.getData());
    }
}
