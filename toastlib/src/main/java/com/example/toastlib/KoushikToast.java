package com.example.toastlib;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import static android.content.Context.WINDOW_SERVICE;
import static androidx.core.app.ActivityCompat.startActivityForResult;

public class KoushikToast {

    static Runnable toastShowRunnable,toastHideRunnable;
    static Handler mHandler=new Handler();
    static WindowManager mWindowManager;
    static View mLayout;
    static  WindowManager.LayoutParams params;
    static long duration=1000;

Context con1;


    @TargetApi(Build.VERSION_CODES.M)
    public static boolean chkforpermission(Context con)
    {
        if(!Settings.canDrawOverlays(con)){


            return false;

        }
       return true;
    }


    public  static  KoushikToast makeText(Context con, String text, int duration_in_seconds)
    {
        //KoushikToast kt = new KoushikToast(con);



        duration=duration_in_seconds*1000;


        toastShowRunnable = new Runnable() {
            public void run() {
                handleShow();
            }
        };

        toastHideRunnable = new Runnable() {
            public void run() {
                handleHide();
            }
        };

        handleHide();
        customview(con,text);
        return new KoushikToast();


    }


    public  void show() {


        mHandler.post(toastShowRunnable);
        //The duration that you want
        mHandler.postDelayed(toastHideRunnable, duration);

    }


    public static  void handleShow() {
try {
    mWindowManager.addView(mLayout, params);
}
    catch (Exception e)
    {
        Toast.makeText(mLayout.getContext(),"you need a android.permission.SYSTEM_ALERT_WINDOW permission in your app ",Toast.LENGTH_LONG).show();
    }

    }

    public static void handleHide() {
        if (mLayout != null) {
            if (mLayout.getParent() != null) {
                mWindowManager.removeView(mLayout);
            }
            mLayout = null;
        }
    }









    public static void customview(Context con, String text)
    {
        mWindowManager = (WindowManager)con.getSystemService(WINDOW_SERVICE);
        LayoutInflater layoutInflater = (LayoutInflater) con.getSystemService(con.LAYOUT_INFLATER_SERVICE);
        mLayout = layoutInflater.inflate(R.layout.custom_toast_main, null);

//Initialisation

TextView texttoast =mLayout.findViewById(R.id.texttoast);

texttoast.setText(text);


        params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE | WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT);
        params.format = PixelFormat.TRANSLUCENT;
        params.windowAnimations = android.R.style.Animation_Toast;
        params.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        params.gravity = Gravity.BOTTOM;



    }









}














