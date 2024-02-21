package com.example.shadowfighthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View v){
        showInfo((Button)v);
    }


    private void showInfo(Button btn){
        Toast.makeText(this, "В разработке", Toast.LENGTH_SHORT).show();
    }

    public void startSecAct(View v){
        Intent intent1 = new Intent(this, EquipmentList.class);
        startActivity(intent1);
    }
}