package org.example.Ex2;

public class CompressorGZIP extends Compressor{

    @Override
    protected int[] compressionSpecifique(int[] data) {
        System.out.println("****************** CompressorGZIP ***************************");
        int[] compress =new  int[data.length];
        for (int i = 0; i < data.length; i++) {
            compress[i]=data[i]/2;
        }
        return compress;
    }

}
