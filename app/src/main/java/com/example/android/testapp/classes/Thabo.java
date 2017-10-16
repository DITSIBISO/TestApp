package com.example.android.testapp.classes;

/**
 * Created by eKasiLab Alex CDTB on 2017/10/16.
 */

public class Thabo extends  PersonClass {
    private  String Licencenumber;

    public String getLicencenumber() {
        return Licencenumber;
    }

    public void setLicencenumber(String licencenumber) {
        Licencenumber = licencenumber;
    }

    public Thabo(String name, String surname, String cellphonenumber, String address, int IDNumber, int age) {
        super(name, surname, cellphonenumber, address, IDNumber, age);


    }
}
