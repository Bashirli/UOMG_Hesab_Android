package com.bashirli.uomghesab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UOMGhesablama extends AppCompatActivity {
EditText et1,et2,et3,et4,et5,et6,et7,et8,et9,et10,et11,et12;
int fenn_sayi;
TextView esasnetice,t1,t2,t3,t4,t5,t6;
EditText []editArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uomghesablama);
        Intent intent=getIntent();
        fenn_sayi=intent.getIntExtra("fenn_say",0);

        et1=findViewById(R.id.editTextTextPersonName2);
        et2=findViewById(R.id.editTextTextPersonName3);
        et3=findViewById(R.id.editTextTextPersonName4);
        et4=findViewById(R.id.editTextTextPersonName5);
        et5=findViewById(R.id.editTextTextPersonName6);
        et6=findViewById(R.id.editTextTextPersonName7);
        et7=findViewById(R.id.editTextTextPersonName8);
        et8=findViewById(R.id.editTextTextPersonName9);
        et9=findViewById(R.id.editTextTextPersonName10);
        et10=findViewById(R.id.editTextTextPersonName11);
        et11=findViewById(R.id.editTextTextPersonName12);
        et12=findViewById(R.id.editTextTextPersonName13);

      esasnetice=findViewById(R.id.textView21);

t1=findViewById(R.id.textView13);
        t2=findViewById(R.id.textView12);
        t3=findViewById(R.id.textView14);
        t4=findViewById(R.id.textView16);
        t5=findViewById(R.id.textView19);
        t6=findViewById(R.id.textView15);

editArray=new EditText[]{et1,et11,et2,et10,et3,et7,et5,et8,et4,et12,et6,et9};
        hisse_gizlet();



    }
public void hisse_gizlet() {
    if (fenn_sayi == 3) {
        et5.setVisibility(View.INVISIBLE);
        et4.setVisibility(View.INVISIBLE);
        et6.setVisibility(View.INVISIBLE);
        et8.setVisibility(View.INVISIBLE);
        et12.setVisibility(View.INVISIBLE);
        et9.setVisibility(View.INVISIBLE);
        t1.setVisibility(View.INVISIBLE);
        t2.setVisibility(View.INVISIBLE);
        t3.setVisibility(View.INVISIBLE);
        t4.setVisibility(View.INVISIBLE);
        t5.setVisibility(View.INVISIBLE);
        t6.setVisibility(View.INVISIBLE);
    } else if (fenn_sayi == 4) {
        et4.setVisibility(View.INVISIBLE);
        et6.setVisibility(View.INVISIBLE);
        et12.setVisibility(View.INVISIBLE);
        et9.setVisibility(View.INVISIBLE);
        t2.setVisibility(View.INVISIBLE);
        t3.setVisibility(View.INVISIBLE);
        t5.setVisibility(View.INVISIBLE);
        t6.setVisibility(View.INVISIBLE);
    } else if (fenn_sayi == 5) {
        et6.setVisibility(View.INVISIBLE);
        et9.setVisibility(View.INVISIBLE);
        t3.setVisibility(View.INVISIBLE);
        t6.setVisibility(View.INVISIBLE);
    }

}


public int problem_tapma(){
        if(fenn_sayi==3) {
            for (int i = 0; i < editArray.length-6; i++) {
                if (editArray[i].getText().toString().length() == 0) {
                    Toast.makeText(this, "Kredit və ya Bal boş buraxılıb!", Toast.LENGTH_SHORT).show();
                    return 0;
                }
            }
        }else if(fenn_sayi==4){
            for (int i = 0; i < editArray.length-4; i++) {
                if (editArray[i].getText().toString().length() == 0) {
                    Toast.makeText(this, "Kredit və ya Bal boş buraxılıb!", Toast.LENGTH_SHORT).show();
                    return 0;
                }
            }
        }else if(fenn_sayi==5){
            for (int i = 0; i < editArray.length-2; i++) {
                if (editArray[i].getText().toString().length() == 0) {
                    Toast.makeText(this, "Kredit və ya Bal boş buraxılıb!", Toast.LENGTH_SHORT).show();
                    return 0;
                }
            }
        }else if(fenn_sayi==6){
            for (int i = 0; i < editArray.length; i++) {
                if (editArray[i].getText().toString().length() == 0) {
                    Toast.makeText(this, "Kredit və ya Bal boş buraxılıb!", Toast.LENGTH_SHORT).show();
                    return 0;
                }
            }
        }



    if(fenn_sayi==3) {
        for (int i = 0; i < editArray.length-6; i++) {
            if (editArray[i].getText().toString().length()  >3 ) {
                Toast.makeText(this, "Kredit və ya Bal düz qeyd olunmayıb!", Toast.LENGTH_SHORT).show();
                return 0;
            }
        }
    }else if(fenn_sayi==4){
        for (int i = 0; i < editArray.length-4; i++) {
            if (editArray[i].getText().toString().length()  >3 ) {
                Toast.makeText(this, "Kredit və ya Bal düz qeyd olunmayıb!", Toast.LENGTH_SHORT).show();
                return 0;
            }
        }
    }else if(fenn_sayi==5){
        for (int i = 0; i < editArray.length-2; i++) {
            if (editArray[i].getText().toString().length()  >3) {
                Toast.makeText(this, "Kredit və ya Bal düz qeyd olunmayıb!", Toast.LENGTH_SHORT).show();
                return 0;
            }
        }
    }else if(fenn_sayi==6){
        for (int i = 0; i < editArray.length; i++) {
            if (editArray[i].getText().toString().length() >3 ) {
                Toast.makeText(this, "Kredit və ya Bal düz qeyd olunmayıb!", Toast.LENGTH_SHORT).show();
                return 0;
            }
        }
    }

        return 1;
}


    public void hesabla(View view){
if(problem_tapma()==0){
    return;
}
if(fenn_sayi==6) {
    double netice;
// editArray=new EditText[]{et1,et11,et2,et10,et3,et7,et5,et8,et4,et12,et6,et9};
    double bal_cem = 0;
    double[] kredit = {Double.parseDouble(et11.getText().toString()), Double.parseDouble(et10.getText().toString()), Double.parseDouble(et7.getText().toString()),
            Double.parseDouble(et8.getText().toString()), Double.parseDouble(et12.getText().toString()), Double.parseDouble(et9.getText().toString())};
    double kredit_cem = 0;
    double[] bal = {Double.parseDouble(et1.getText().toString()), Double.parseDouble(et2.getText().toString()), Double.parseDouble(et3.getText().toString()),
            Double.parseDouble(et5.getText().toString()), Double.parseDouble(et4.getText().toString()), Double.parseDouble(et6.getText().toString())};
    for (int i = 0; i < kredit.length; i++) {
        kredit_cem += kredit[i];
    }

    for(int i=0;i<bal.length;i++){
        bal_cem=bal_cem+(kredit[i]*bal[i]);
    }

    netice=bal_cem/kredit_cem;
    esasnetice.setText("Ortalama bal : "+netice);


} else if(fenn_sayi==3){
    double netice;
// editArray=new EditText[]{et1,et11,et2,et10,et3,et7,et5,et8,et4,et12,et6,et9};
    double bal_cem = 0;
    double[] kredit = {Double.parseDouble(et11.getText().toString()), Double.parseDouble(et10.getText().toString()), Double.parseDouble(et7.getText().toString())};
    double kredit_cem = 0;
    double[] bal = {Double.parseDouble(et1.getText().toString()), Double.parseDouble(et2.getText().toString()), Double.parseDouble(et3.getText().toString()),};
    for (int i = 0; i < kredit.length; i++) {
        kredit_cem += kredit[i];
    }

    for(int i=0;i<bal.length;i++){
        bal_cem=bal_cem+(kredit[i]*bal[i]);
    }

    netice=bal_cem/kredit_cem;
    esasnetice.setText("Ortalama bal : "+netice);

}else if(fenn_sayi==5){
    double netice;
// editArray=new EditText[]{et1,et11,et2,et10,et3,et7,et5,et8,et4,et12,et6,et9};
    double bal_cem = 0;
    double[] kredit = {Double.parseDouble(et11.getText().toString()), Double.parseDouble(et10.getText().toString()), Double.parseDouble(et7.getText().toString()),
            Double.parseDouble(et8.getText().toString()), Double.parseDouble(et12.getText().toString())};
    double kredit_cem = 0;
    double[] bal = {Double.parseDouble(et1.getText().toString()), Double.parseDouble(et2.getText().toString()), Double.parseDouble(et3.getText().toString()),
            Double.parseDouble(et5.getText().toString()), Double.parseDouble(et4.getText().toString())};
    for (int i = 0; i < kredit.length; i++) {
        kredit_cem += kredit[i];
    }

    for(int i=0;i<bal.length;i++){
        bal_cem=bal_cem+(kredit[i]*bal[i]);
    }

    netice=bal_cem/kredit_cem;
    esasnetice.setText("Ortalama bal : "+netice);

}else if(fenn_sayi==4){
    double netice;
// editArray=new EditText[]{et1,et11,et2,et10,et3,et7,et5,et8,et4,et12,et6,et9};
    double bal_cem = 0;
    double[] kredit = {Double.parseDouble(et11.getText().toString()), Double.parseDouble(et10.getText().toString()), Double.parseDouble(et7.getText().toString()),
            Double.parseDouble(et8.getText().toString())};
    double kredit_cem = 0;
    double[] bal = {Double.parseDouble(et1.getText().toString()), Double.parseDouble(et2.getText().toString()), Double.parseDouble(et3.getText().toString()),
            Double.parseDouble(et5.getText().toString())};
    for (int i = 0; i < kredit.length; i++) {
        kredit_cem += kredit[i];
    }

    for(int i=0;i<bal.length;i++){
        bal_cem=bal_cem+(kredit[i]*bal[i]);
    }

    netice=bal_cem/kredit_cem;
    esasnetice.setText("Ortalama bal : "+netice);

}

    }
}