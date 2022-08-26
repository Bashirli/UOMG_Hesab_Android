package com.bashirli.uomghesab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioButton r1,r2,r3,r4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
r1=findViewById(R.id.radioButton);
        r2=findViewById(R.id.radioButton2);
        r3=findViewById(R.id.radioButton3);
        r4=findViewById(R.id.radioButton4);

    }


    public void HesablamayaKec(View view){
if(r1.isChecked()){
    Intent intent=new Intent(MainActivity.this,UOMGhesablama.class);
    intent.putExtra("fenn_say",3);
    startActivity(intent);

}else if(r2.isChecked()){

    Intent intent=new Intent(MainActivity.this,UOMGhesablama.class);
    intent.putExtra("fenn_say",4);
    startActivity(intent);


}else if(r3.isChecked()){

    Intent intent=new Intent(MainActivity.this,UOMGhesablama.class);
    intent.putExtra("fenn_say",5);
    startActivity(intent);


}else if(r4.isChecked()){

    Intent intent=new Intent(MainActivity.this,UOMGhesablama.class);
    intent.putExtra("fenn_say",6);
    startActivity(intent);


}


else {
    Toast.makeText(this, "Fənn sayı seçilmədi!", Toast.LENGTH_SHORT).show();
}


    }
}