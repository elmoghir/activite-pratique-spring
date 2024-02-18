package Presentation;

import Dao.IdaoImpl;
import metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args) {
       IdaoImpl dao = new IdaoImpl();
       IMetierImpl metier = new IMetierImpl(dao);
       //metier.setDao(dao);
        // Injection with constructor
        System.out.println("Result = "+ metier.calcule());

    }
}
