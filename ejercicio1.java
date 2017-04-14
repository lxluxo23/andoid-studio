package com.lxluxo23.indicedemasacorporal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;


public class ejercicio1 extends AppCompatActivity {

private Spinner sp1,sp2;
private RadioButton r1,r2;
private CheckBox che1,che2;
    private TextView tv1,tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        r1 = (RadioButton) findViewById(R.id.radioButton);
        r2 = (RadioButton) findViewById(R.id.radioButton2);



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        sp1 = (Spinner) findViewById(R.id.spinner);

        String c="";


      for (int i=100;i<=200;i++) {


          c = String.valueOf(i);
          adapter.add(c);


      }

        sp1.setAdapter(adapter);



        sp2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        String p="";


        for (int i=30;i<=200;i++) {


            p = String.valueOf(i);
            adapter1.add(p);
        }

        sp2.setAdapter(adapter1);


        tv1 = (TextView) findViewById(R.id.textView4);
        tv2 = (TextView) findViewById(R.id.textView7);

        String s1 = sp1.getSelectedItem().toString();
        String s2 = sp2.getSelectedItem().toString();


        float resul;
        float a;
        float b;
        float pe;

        b = Float.parseFloat(s1);
        pe = Float.parseFloat(s2);

        a = b / 100;
        resul = (pe / (a * a));


        String resu = String.valueOf(resul);

        che1 = (CheckBox) findViewById(R.id.checkBox);
        che2 = (CheckBox) findViewById(R.id.checkBox2);


    }

    public  void operar(View view) {

            if (che1.isChecked()) {


                String s1 = sp1.getSelectedItem().toString();
                String s2 = sp2.getSelectedItem().toString();


                float resul;
                float a;
                float b;
                float pe;

                b = Float.parseFloat(s1);
                pe = Float.parseFloat(s2);

                a = b / 100;
                resul = (pe / (a * a));


                String resu = String.valueOf(resul);

                tv1.setText(resu);

        }
        else {

                tv1.setText("");
            }



    }


    public void operar2 (View view){


        if (che2.isChecked()){

            String s1 = sp1.getSelectedItem().toString();


            float pid,b;
            b = Float.parseFloat(s1);
            pid = b-100;

            String pesoi = String.valueOf(pid);


            tv2.setText(pesoi);


        }

        else {

            tv2.setText("");
        }












    }




}
