package com.example.lab6_ph46164;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class contextMenu extends AppCompatActivity {

    ListView lstContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu2);

        lstContext = findViewById(R.id.lvmenu);
        String[] ten = new String[] {"Duong","Hong","Nga"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ten);
        lstContext.setAdapter(adapter);
        registerForContextMenu(lstContext);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
}