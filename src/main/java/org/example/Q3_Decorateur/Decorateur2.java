package org.example.Q3_Decorateur;

public class Decorateur2 extends Decorateur{
    public Decorateur2(Composant composant) {
        super(composant);
    }

    @Override
    public void traitement() {
        composant.traitement();
        System.out.println("+ traitement  de decorateur 2");
    }
}
