package org.example.Ex1_Q4_Observer;

public class Camera implements Observer{
    @Override
    public void update(int newscore) {
        System.out.println("Camera : j'ai recu nouveau scrore " + newscore);
    }
}
