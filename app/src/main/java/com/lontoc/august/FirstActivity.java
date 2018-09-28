package com.lontoc.august;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);
    }

    public void process1 (View v){
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button_act2){
            i = new Intent(this, SecondActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.button_map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5325237,121.0762019"));
            chooser = Intent.createChooser(i, "Choose a Map Application:");
            startActivity(chooser);
        }
    }
}
