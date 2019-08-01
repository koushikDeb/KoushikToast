package com.example.toastlib;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import static android.content.Context.WINDOW_SERVICE;
import static androidx.core.app.ActivityCompat.startActivityForResult;
import static androidx.core.content.ContextCompat.getColor;
import static androidx.core.content.ContextCompat.getDrawable;
import static com.example.toastlib.Viewgenarator.currentviewholder;

public class KoushikToast {

    static Runnable toastShowRunnable,toastHideRunnable;
    static Handler mHandler=new Handler();
    static WindowManager mWindowManager;
     View mLayout;
    static  WindowManager.LayoutParams params;
    static long duration=1000;

    static  KoushikToast kt=new KoushikToast();
    static Context context;
static View previous_view;


    public  static  KoushikToast makeText(Context con, String text, int duration_in_seconds)
    {


        context=con;
        duration=duration_in_seconds*1000;

        handleHide(previous_view);
        final View mLayout = Viewgenarator.customview(con,text);

        previous_view=mLayout;


        toastShowRunnable = new Runnable() {
            public void run() {
                handleShow(mLayout);
            }
        };


        toastHideRunnable = new Runnable() {
            public void run() {
                handleHide(mLayout);
            }
        };




        return kt;


    }

   public  void show() {


        mHandler.post(toastShowRunnable);
        //The duration that you want
        mHandler.postDelayed(toastHideRunnable, duration);

    }


    public static  void handleShow(View mLayout) {
        try {
            mWindowManager.addView(mLayout, params);
        }
        catch (Exception e)
        {
            Toast.makeText(mLayout.getContext(),"You need a android.permission.SYSTEM_ALERT_WINDOW permission in your app ",Toast.LENGTH_LONG).show();
        }

    }

    public static void handleHide(View mLayout) {
        if (mLayout != null) {
            if (mLayout.getParent() != null) {
                mWindowManager.removeView(mLayout);
            }
            mLayout = null;
        }
    }










  public    KoushikToast setBackgroundDrawable(int drawable_id)
    {
        currentviewholder.getToast_type().setBackground(getDrawable(context,drawable_id));
        return kt;
    }

    public KoushikToast setBackgroundColor(int color_id)
    {   currentviewholder.getToast_type().setBackgroundColor(getColor(context,color_id));
        return kt;
    }


    public  KoushikToast setTextColor(int color_id)
    {
        currentviewholder.getTexttoast().setTextColor(getColor(context,color_id));
        return kt;
    }



}














