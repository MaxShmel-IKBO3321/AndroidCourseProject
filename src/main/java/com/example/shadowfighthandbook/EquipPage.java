package com.example.shadowfighthandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EquipPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip_page);

        ConstraintLayout equipBg = findViewById(R.id.equipPageBg);
        ImageView equipPageImage = findViewById(R.id.equipPageImage);
        TextView equipTitle = findViewById(R.id.textView3);
        TextView equipFaction = findViewById(R.id.equipPageFaction);
        TextView equipChapter = findViewById(R.id.equipPageChapter);
        TextView equipText = findViewById(R.id.textView4);

        equipBg.setBackgroundColor(getIntent().getIntExtra("equipBg", 0));
        equipPageImage.setImageResource(getIntent().getIntExtra("equipPageImage", 0));
        equipTitle.setText(getIntent().getStringExtra("textView3"));
        equipFaction.setText(getIntent().getStringExtra("equipPageFaction"));
        equipChapter.setText(getIntent().getStringExtra("equipPageChapter"));
        equipText.setText(getIntent().getStringExtra("textView4"));
    }
}