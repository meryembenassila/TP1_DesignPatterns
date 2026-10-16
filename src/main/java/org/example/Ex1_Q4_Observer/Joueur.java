package org.example.Ex1_Q4_Observer;

import java.util.ArrayList;
import java.util.List;

public class Joueur implements Observable{

    private int score;
    private List<Observer> observers;

    public Joueur(){
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
          observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
      observers.forEach(observer -> {
          observer.update(score);

      });
    }

    public void setScore(int score) {
        this.score = score;
        notifyObservers();

    }
}
