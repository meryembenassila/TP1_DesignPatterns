package org.example.Q3_Decorateur;

public class Test {
    public static void main(String[] args) {
        Composant composant = new ComposantConcret();
        composant = new Decorateur1(composant);
        composant=new Decorateur2(composant);
        System.out.println("**************effectuer traitement de composant **************************");
        composant.traitement();
        System.out.println("*************************************************************************");
    }
}
