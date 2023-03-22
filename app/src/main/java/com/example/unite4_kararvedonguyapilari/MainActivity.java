package com.example.unite4_kararvedonguyapilari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.unite4_kararvedonguyapilari.uyg10.uyg10;
import com.example.unite4_kararvedonguyapilari.uyg11.uyg11;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnUyg1Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg1Activity.class);
        startActivity(i);
    }

    public void btnUyg2Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2Activity.class);
        startActivity(i);


    }

    public void btnUyg10Goster(View view) {
        Intent i = new Intent(MainActivity.this, uyg10.class);
        startActivity(i);


    }

    public void btnUyg11Goster(View view) {
        Intent i = new Intent(MainActivity.this, uyg11.class);
        startActivity(i);
    }
}