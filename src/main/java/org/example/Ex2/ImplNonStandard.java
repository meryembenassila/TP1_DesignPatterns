package org.example.Ex2;

public class ImplNonStandard {
    public int[] appliquerFiltre(String filterName, int[] data){
        System.out.println("****************** FiltreStandard***************************");
        int[] filter =new  int[data.length];
        for (int i = 0; i < data.length; i++) {
            filter[i]= (int) (data[i]*Math.pow(data[i],3));
        }
        return filter;

    }
}
