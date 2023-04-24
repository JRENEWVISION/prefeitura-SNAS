package com.example.snas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Cadastro(View view){
        Intent PackageContext;
        Intent in = new Intent(MainActivity.this, Telacadastro.class);
        startActivity(in);
    }
}