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
import com.koushik.toastlast.Service.Chkwindow_Service;
import com.koushik.toastlast.Service.LocalService;

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



        //KoushikToast.makeText(this,"text text",4).show();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(new Intent(this, LocalService.class));
        }
        else {
            startService(new Intent(this,Chkwindow_Service.class));
        }


    }



    }

