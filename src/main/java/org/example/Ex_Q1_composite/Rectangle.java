package org.example.Ex_Q1_composite;

public class Rectangle extends Figure{

    private double largeur ;
    private double longueur;
    private String couleur ;

    public Rectangle(double longueur, double largeur, String couleur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.couleur = couleur;
    }


    @Override
    void dessiner() {
              System.out.println(" Rectangle en " + couleur +" avec largeur : " + largeur +" cm ,  longueur : "+ longueur +" cm");
    }

    @Override
    double calculersurface() {
          return largeur*longueur;
    }
}
