package org.example.Ex2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Image image = new Image(new int[]{1,2,3,4,5});
        Compressor compressor = new CompressorGZIP();
        Filter filter = new FiltreGaussien();

        image.setCompressor(compressor);
        image.setFilter(filter);


        System.out.println(Arrays.toString(image.compress()));
        System.out.println(Arrays.toString(image.filter()));

        System.out.println("*********************************************");
        image.setCompressor(new CompressorZip());


        System.out.println(Arrays.toString(image.compress()));
        System.out.println(Arrays.toString(image.filter()));


    }
}
