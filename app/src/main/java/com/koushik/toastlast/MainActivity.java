package com.koushik.toastlast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import com.example.toastlib.KoushikToast;


public class MainActivity extends AppCompatActivity {



    EditText et;
    long toastdu=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.insec);



    }

    public void onclick(View view) {


        KoushikToast.makeText(this,"service test",3).show();



    }



    }

