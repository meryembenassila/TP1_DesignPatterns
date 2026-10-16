package org.example.Ex2;

public class FiltreGaussien implements  Filter{
    @Override
    public int[] filter(int[] data) {
        System.out.println("****************** FiltreGaussien ***************************");
        int[] filter =new  int[data.length];
        for (int i = 0; i < data.length; i++) {
            filter[i]= (int) (data[i]*Math.pow(data[i],2));
        }
        return filter;
    }
}
