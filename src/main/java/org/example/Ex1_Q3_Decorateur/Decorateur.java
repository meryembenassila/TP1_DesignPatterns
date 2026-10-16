package org.example.Ex1_Q3_Decorateur;

public abstract class Decorateur implements Composant{
    protected Composant composant;

    public Decorateur(Composant composant){
        this.composant=composant;
    }

}
