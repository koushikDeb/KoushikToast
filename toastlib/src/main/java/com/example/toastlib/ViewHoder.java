package com.example.toastlib;

import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.toastlib.R;



public  class ViewHoder {
    View mLayout;
    TextView texttoast ;
    LinearLayout toast_type;



    ViewHoder(View mLayout)
    {
        this.mLayout=mLayout;

    }


    public TextView getTexttoast() {

        texttoast =mLayout.findViewById(R.id.texttoast);

        return texttoast;
    }

    public LinearLayout getToast_type() {
        toast_type=((LinearLayout)mLayout.findViewById(R.id.toast_type));
        return toast_type;
    }

}
