package ext;

import Dao.Idao;

public class IdaoImpV2 implements Idao {
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double temp = 11;
        return temp;
    }
}
