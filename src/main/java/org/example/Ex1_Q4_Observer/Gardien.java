package org.example.Ex1_Q4_Observer;

public class Gardien implements Observer{
    @Override
    public void update(int newscore) {
        System.out.println("Gardien : j'ai recu nouveau scrore " + newscore);
    }
}
