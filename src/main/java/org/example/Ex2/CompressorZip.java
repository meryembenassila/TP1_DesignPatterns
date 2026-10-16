package org.example.Ex2;

public class CompressorZip extends   Compressor{


    @Override
    protected int[] compressionSpecifique(int[] data) {
        System.out.println("****************** CompressorZIP ***************************");
        int[] compress =new  int[data.length];
        for (int i = 0; i < data.length; i++) {
            compress[i]=data[i]/4;
        }
        return compress;
    }
}
