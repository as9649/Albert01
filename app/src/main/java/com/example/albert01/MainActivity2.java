package com.example.albert01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button btn;
    TextView tV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn= findViewById(R.id.btn);
        tV= findViewById(R.id.tV);
        Intent gi=getIntent();
        double num1=gi.getDoubleExtra("num1", 0);
        tV.setText(""+num1);
    }

    public void back(View view) {
        Intent go=new Intent(this, MainActivity.class);
        startActivity(go);
    }
}