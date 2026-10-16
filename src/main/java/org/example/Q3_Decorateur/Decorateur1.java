package org.example.Q3_Decorateur;

public class Decorateur1 extends Decorateur{


    public Decorateur1(Composant composant) {
        super(composant);
    }

    @Override
    public void traitement() {
        composant.traitement();
        System.out.println("+ traitement  de decorateur 1");
    }
}
