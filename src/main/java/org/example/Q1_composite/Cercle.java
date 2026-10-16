package org.example.Q1_composite;

public class Cercle extends Figure{

    private double rayon ;
    private String couleur ;

    public Cercle(double rayon, String couleur) {
        this.rayon = rayon;
        this.couleur = couleur;
    }

    @Override
    void dessiner() {
        System.out.println(" Cercle en " + couleur + " avec rayon : " +rayon +" cm");
    }

    @Override
    double calculersurface() {
        return Math.pow(rayon,2)*Math.PI;
    }
}
