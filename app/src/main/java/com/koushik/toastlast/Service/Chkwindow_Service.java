package com.koushik.toastlast.Service;

import android.app.Service;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.widget.Toast;

import com.example.toastlib.KoushikToast;

public class Chkwindow_Service extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }




    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        CountDownTimer ct = new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                KoushikToast.makeText(Chkwindow_Service.this,"I am custom toast from Service",5).show();
            }
        };


        return START_STICKY;
    }




}
