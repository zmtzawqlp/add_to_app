package com.eastmoney.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import io.flutter.embedding.android.FlutterActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(final View view) {
               Intent intent = FlutterActivity.withNewEngine().initialRoute("route1").build(MainActivity.this);
               intent.putExtra("background_mode","transparent");
               startActivity(
                       intent
               );
           }
       });
    }


}

