package presentation;

import metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"dao", "metier"})
public class Presentation2 {
    public static void main(String[] args) {
        // Création du contexte Spring avec activation du profil "dev"
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");  // "prod" -> DaoImpl (200.0)
        context.register(Presentation2.class);
        context.refresh();

        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Résultat = " + metier.calcul());

        context.close();
    }
}
