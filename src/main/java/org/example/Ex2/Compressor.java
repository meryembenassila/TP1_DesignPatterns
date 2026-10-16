package org.example.Ex2;

public abstract class Compressor {
    public int[] compresser (int [] data){
        System.out.println("Préparation des données");

        int[] resultat = compressionSpecifique(data);

        System.out.println("Compression terminée");

        return resultat;
    }

    protected abstract int[] compressionSpecifique(int[] data);
}
