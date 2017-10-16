package com.example.android.testapp.classes;

/**
 * Created by eKasiLab Alex CDTB on 2017/10/16.
 */

public class Pearl extends PersonClass {
   private int NumofWeaves;

    public int getNumofWeaves() {
        return NumofWeaves;
    }

    public void setNumofWeaves(int numofWeaves) {
        NumofWeaves = numofWeaves;
    }

    public Pearl(String name, String surname, String cellphonenumber, String address, int IDNumber, int age) {
        super(name, surname, cellphonenumber, address, IDNumber, age);

    }
}
