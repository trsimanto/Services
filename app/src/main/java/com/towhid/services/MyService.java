package com.towhid.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    int a = 0;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "Services Create", Toast.LENGTH_SHORT).show();
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        a++;
        Toast.makeText(this, "Services Starts : " + a, Toast.LENGTH_SHORT).show();
        return START_NOT_STICKY;// super.onStartCommand(intent, flags, startId);  //START_STICKY; ata use korle service auto e on hoea jay jode system off kore day
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Services stop ", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

}
