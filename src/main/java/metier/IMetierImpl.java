package metier;

import Dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImpl implements IMetier {
    @Autowired
    private Idao dao;

    public IMetierImpl() {
    }

    public IMetierImpl(Idao dao) {
        this.dao = dao;
    }

    @Override
    public double calcule() {
        double tmp = dao.getData();
        double res = (tmp * 540) / Math.cos(tmp*Math.PI);
        return res ;
    }

    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
