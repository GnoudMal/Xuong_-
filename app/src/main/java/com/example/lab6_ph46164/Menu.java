package com.example.lab6_ph46164;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBai1 = findViewById(R.id.btnBai1);
        Button btnBai2 = findViewById(R.id.btnBai2);
        Button btnBai3 = findViewById(R.id.btnBai3);
        Button btnBai4 = findViewById(R.id.btnBai4);

        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, optionMenu.class);
                startActivity(intent);
            }
        });


        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this,contextMenu.class);
                startActivity(intent);
            }
        });
//
//        btnBai3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Menu.this,Login.class);
//                startActivity(intent);
//            }
//        });
//
//        btnBai4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Menu.this,BaiThem_TrangChu.class);
//                startActivity(intent);
//            }
//        });
    }
}