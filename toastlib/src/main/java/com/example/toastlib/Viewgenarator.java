package com.example.toastlib;

import android.content.Context;
import android.graphics.PixelFormat;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

import static android.content.Context.WINDOW_SERVICE;

import static com.example.toastlib.KoushikToast.params;
import static com.example.toastlib.KoushikToast.mWindowManager;




public class Viewgenarator {




static ViewHoder currentviewholder;


    public static View customview(Context con, String text)
    {
        mWindowManager = (WindowManager)con.getSystemService(WINDOW_SERVICE);
        LayoutInflater layoutInflater = (LayoutInflater) con.getSystemService(con.LAYOUT_INFLATER_SERVICE);
        View mLayout = layoutInflater.inflate(R.layout.custom_toast_main, null);

//Initialisation

        ViewHoder vh =new ViewHoder(mLayout);
        vh.getTexttoast().setText(text);
//vh.getToast_type().setBackground((R.drawable.default_shape));
        currentviewholder=vh;


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


        return mLayout;
    }




}
