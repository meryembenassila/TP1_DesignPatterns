package org.example.Ex2;

public class CompressorZip implements  Compressor{
    @Override
    public int[] compresser(int[] data) {
        System.out.println("****************** CompressorZIP ***************************");
        int[] compress =new  int[data.length];
        for (int i = 0; i < data.length; i++) {
            compress[i]=data[i]/4;
        }
        return compress;
    }
}
