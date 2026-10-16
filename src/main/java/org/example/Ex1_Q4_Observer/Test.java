package org.example.Ex1_Q4_Observer;

public class Test {
    public static void main(String[] args) {
        Joueur joueur = new Joueur();
        Camera camera = new Camera();
        Gardien gardien = new Gardien();
        Couloir couloir = new Couloir();

        joueur.addObserver(gardien);
        joueur.addObserver(camera);
        joueur.addObserver(couloir);

        System.out.println("*********************************************");
        joueur.setScore(3);
        System.out.println("***********************************************");
        joueur.removeObserver(couloir);
        System.out.println("*********************************************");
        joueur.setScore(4);
        System.out.println("***********************************************");


    }
}
