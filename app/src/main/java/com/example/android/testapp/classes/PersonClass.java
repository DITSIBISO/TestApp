package com.example.android.testapp.classes;

/**
 * Created by eKasiLab Alex CDTB on 2017/10/16.
 */

public class PersonClass {
    String Name;
    String Surname;
    String Cellphonenumber;
    String Address;
    int IDNumber;
    int Age;

    public PersonClass() { super();
    }

    public PersonClass(String name, String surname, String cellphonenumber, String address, int IDNumber, int age) {
        Name = name;
        Surname = surname;
        Cellphonenumber = cellphonenumber;
        Address = address;
        this.IDNumber = IDNumber;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getCellphonenumber() {
        return Cellphonenumber;
    }

    public void setCellphonenumber(String cellphonenumber) {
        Cellphonenumber = cellphonenumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
}
