package org.example.Ex_Q1_composite;

public class Test {
    public static void main(String[] args) {
        Cercle cercle1 = new Cercle(2.5,"vert");
        Cercle cercle2 = new Cercle(3,"rouge");
        Rectangle rectangle1 = new Rectangle(2,4,"bleu");
        Rectangle rectangle2 = new Rectangle(3,6,"rouge");

        Groupe groupe1 = new Groupe();
        groupe1.Addfigure(cercle1);
        groupe1.Addfigure(rectangle1);

        Groupe groupe2 = new Groupe();
        groupe2.Addfigure(cercle1);
        groupe2.Addfigure(rectangle2);
        groupe2.Addfigure(groupe1);

        System.out.println(" *****************Dessin Groupe 2*********************");
        groupe2.dessiner();
        System.out.println(" *****************Surface Groupe 2*********************");
        System.out.println("surface =" +  groupe2.calculersurface());


    }
}
