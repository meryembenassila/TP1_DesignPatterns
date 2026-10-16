package org.example.Ex2;

public class AdapterFilterNonStandard extends  ImplNonStandard implements Filter {
    @Override
    public int[] filter(int[] data) {
        System.out.println("********** Adaptation ************************");
        return super.appliquerFiltre("Filtre Standart",data);
    }
}
