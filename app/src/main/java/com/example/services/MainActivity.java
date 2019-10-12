package com.example.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         t11 =findViewById(R.id.text1);
         t11.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(t11.getText().toString().equals("Started")){
                     t11.setText("Stopped");
                     stopService(new Intent(MainActivity.this,service.class));
                 }else{
                     t11.setText("Started");
                     stopService(new Intent(MainActivity.this,service.class));
                 }
             }
         });
    }
}
