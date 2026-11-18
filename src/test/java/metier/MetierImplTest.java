package metier;

import dao.IDao;
import org.junit.Assert;
import org.junit.Test;

public class MetierImplTest {

    @Test
    public void testCalcul() {
        // Implémentation fictive de IDao pour le test
        IDao dao = new IDao() {
            @Override
            public double getValue() {
                return 10.0;
            }
        };

        // Injection manuelle de la dépendance
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        Assert.assertEquals(20.0, metier.calcul(), 0.001);  // 10.0 * 2 = 20.0
    }
}
