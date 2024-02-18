package Dao;

import org.springframework.stereotype.Component;

import static java.lang.Math.random;
@Component("dao")
public class IdaoImpl implements Idao {
    @Override
    public double getData() {
        System.out.println("Version de la base de donne");
        double temp = random() * 40;
        return temp;
    }
}
