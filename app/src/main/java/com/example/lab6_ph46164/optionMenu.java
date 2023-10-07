package com.example.lab6_ph46164;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class optionMenu extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);
        toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Lab6");
        getSupportActionBar().setSubtitle("MD18403");
        getSupportActionBar().setLogo(R.drawable.ic_launcher_background);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.search){
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.add){
            Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.lichhoc){
            Toast.makeText(this, "lich hoc", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}