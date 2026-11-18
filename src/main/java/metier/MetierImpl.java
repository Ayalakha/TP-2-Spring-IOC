package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    // Avec les profils, un seul bean IDao est actif à la fois : pas besoin de @Qualifier.
    // (Sans profils, ajouter @Qualifier("dao2") pour choisir DaoImpl2 -> Étape 6.)
    @Autowired
    private IDao dao;

    @Override
    public double calcul() {
        return dao.getValue() * 2;
    }

    // Setter utilisé par la configuration XML et par les tests unitaires
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
