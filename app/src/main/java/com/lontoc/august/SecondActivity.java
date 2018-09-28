package com.lontoc.august;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);
    }

    public void process2 (View v){
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button_act1){
            i = new Intent(this, FirstActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.button_map2){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.7938974,120.9514153"));
            chooser = Intent.createChooser(i, "Choose a Map Application:");
            startActivity(chooser);
        }
    }
}
