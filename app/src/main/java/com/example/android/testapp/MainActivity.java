package com.example.android.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.testapp.classes.Pearl;
import com.example.android.testapp.classes.Thabo;

import static android.R.attr.id;
import static android.R.attr.name;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.os.Build.VERSION_CODES.N;
import static com.example.android.testapp.R.id.surnamee;

public class MainActivity extends AppCompatActivity {
    private Thabo obj;
    private Pearl obj2;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      Thabo obj = new Thabo("Thabo","Masete","0714570440","6484 winnie mandela",8806070,25);


      //Thabo
      TextView name= (TextView) findViewById(R.id.name);
      TextView surname= (TextView) findViewById(R.id.surname);
      TextView CellphoneNUMBER= (TextView) findViewById(R.id.CellphoneNUMBER);
      TextView IDNumber= (TextView) findViewById(R.id.IDNumber);
      TextView Address= (TextView) findViewById(R.id.Address);
      TextView Age= (TextView) findViewById(R.id.Age);




        //Thabo
        name.setText(obj.getName());
        surname.setText(obj.getSurname());
        CellphoneNUMBER.setText(obj.getCellphonenumber());
        IDNumber.setText(Integer.toString(obj.getIDNumber()));
        Address.setText(obj.getAddress());
        Age.setText(Integer.toString(obj.getAge()));


        Pearl obj2 = new Pearl("Pearl","Masete","0715679440","6989 winnie mandela",87020607,20);
        //Pearl
        TextView named= (TextView) findViewById(R.id.Named);
        TextView surnamee= (TextView) findViewById(R.id.surnamee);
        TextView CellphoneNUMBERR= (TextView) findViewById(R.id.CellphoneNUMBERR);
        TextView IDNumberr= (TextView) findViewById(R.id.IDNumberr);
        TextView Addresss= (TextView) findViewById(R.id.Addresss);
        TextView Agee= (TextView) findViewById(R.id.Agee);


       //Pearl
        named.setText(obj2.getName());
        surnamee.setText(obj2.getSurname());
        CellphoneNUMBERR.setText(obj2.getCellphonenumber());
        IDNumberr.setText(Integer.toString(obj2.getIDNumber()));
        Addresss.setText(obj2.getAddress());
        Agee.setText(Integer.toString(obj2.getAge()));




    }
}
