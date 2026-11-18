package presentation;

import metier.IMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationXML {
    public static void main(String[] args) {
        // Chargement du contexte Spring à partir du fichier XML
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println("Résultat (XML) = " + metier.calcul());

        context.close();
    }
}
