package com.koushik.toastlast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.toastlib.KoushikToast;


public class MainActivity extends AppCompatActivity {



    EditText et;
    long toastdu=10;
    int clicked=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.insec);



    }

    public void onclick(View view) {


        switch(clicked)
        {
            case 0 :  KoushikToast.makeText(this,"Default Toast",3).show();
                break;
            case 1 :  KoushikToast.makeText(this,"Drawable background Toast",5).setBackgroundDrawable(R.drawable.default_shape).show();
                break;
            case 2 :  KoushikToast.makeText(this,"Drawable background Toast with  text color black",5).setBackgroundDrawable(R.drawable.default_shape2).setTextColor(android.R.color.black).show();
                break;
            case 3 :  KoushikToast.makeText(this,"Color background Toast white text",5).setBackgroundColor(R.color.colorAccent).setTextColor(android.R.color.white).show();
                break;
            case 5 :  KoushikToast.makeText(this,"Color background Toast",5).setBackgroundColor(R.color.colorAccent).show();
                break;
        }


























   //     KoushikToast.makeText(this,"text",5).setBackgroundDrawable(R.drawable.default_shape).setTextColor(R.color.colorPrimaryDark).show();





 if(clicked==5)
 {
     clicked=0;
 }else {
     clicked++;
 }

    }



    }

