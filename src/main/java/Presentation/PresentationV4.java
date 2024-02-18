package Presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationV4 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("Dao","metier");
        IMetier metier = (IMetier) context.getBean(IMetier.class);
        System.out.println(metier.calcule());
    }
}
