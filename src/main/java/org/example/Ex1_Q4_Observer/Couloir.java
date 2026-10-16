package org.example.Ex1_Q4_Observer;

public class Couloir implements Observer{
    @Override
    public void update(int newscore) {
        System.out.println("Couloir : j'ai recu nouveau scrore " + newscore);
    }
}
