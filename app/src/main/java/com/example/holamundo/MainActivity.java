package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.holamundo.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void muestraventanalogin (View vista){
        Intent ventana = new Intent(this, LoginActivity.class);
        startActivity(ventana);
    }
}