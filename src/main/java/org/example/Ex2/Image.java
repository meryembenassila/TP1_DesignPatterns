package org.example.Ex2;

public class Image {
    int[] data ;

    public Image(int[] data){
       this.data = data;
    }

    private Filter filter ;
    private Compressor compressor;


    public  int[] compress(){

        return  compressor.compresser(data);
    }

    public  int[] filter(){
        return   filter.filter(data);
    }


    public void setCompressor(Compressor compressor) {
        this.compressor = compressor;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}
