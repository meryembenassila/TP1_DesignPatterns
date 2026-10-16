package org.example.Q1_composite;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Figure{
    private List<Figure> figures;

    public Groupe() {
        this.figures = new ArrayList<>();
    }


    public void Addfigure(Figure figure){
         figures.add(figure);
    }

    public void Supprimerfigure(Figure figure){
        figures.remove(figure);
    }

    @Override
    void dessiner() {
        System.out.println("Je suis Groupe  qui contient :");
        for (Figure figure : figures) {
           figure.dessiner();
        }
    }

    @Override
    double calculersurface() {
        double surface = 0;

        for (Figure figure : figures) {
            surface += figure.calculersurface();
        }

        return surface;
    }
}
