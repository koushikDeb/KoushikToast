package com.example.toastlib;

import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;



public  class ViewHoder {
    View mLayout;
    TextView texttoast ;
    LinearLayout toast_type;
    ImageView toast_icon;


    ViewHoder(View mLayout)
    {
        this.mLayout=mLayout;

    }



    public ImageView getToastIcon()
    {
        toast_icon=(ImageView) mLayout.findViewById(R.id.toast_icon1);

        return toast_icon;
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
