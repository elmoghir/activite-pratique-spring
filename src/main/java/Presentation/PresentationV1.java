package Presentation;

import Dao.Idao;
import metier.IMetier;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class PresentationV1 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(new File("conf.txt"));
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            Idao dao = (Idao) cDao.getConstructor().newInstance();

            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(daoClassName);
            IMetier metier = (IMetier) cMetier.getConstructor(Idao.class).newInstance(dao);

            System.out.println(metier.calcule());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
