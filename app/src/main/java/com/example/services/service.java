package com.example.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class service extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public int onStartCommand(Intent intent,int flags,int startId) {
        Toast.makeText(this, "Services Started By User", Toast.LENGTH_SHORT).show();
        return START_STICKY;    //START STICKY is return type
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "Services destroyed", Toast.LENGTH_SHORT).show();
    }
}
