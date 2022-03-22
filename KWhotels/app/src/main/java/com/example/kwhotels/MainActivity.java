package com.example.kwhotels;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<items> hotels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        items i1 = new items("Jumeirah", R.drawable.jumeirah, 70.9);
        items i2 = new items("Marina", R.drawable.marina, 50.8);
        items i3 = new items("Four Seasons", R.drawable.fourseasons, 58.9);
        items i4 = new items("Movenpick", R.drawable.movenpick, 60.5);
        items i5 = new items("Regency", R.drawable.regency, 69.0);
        items i6 = new items("Safir", R.drawable.safir, 45.9);
        items i7 = new items("Symphony Style", R.drawable.symphonystyle, 65.7);


        hotels.add(i1);
        hotels.add(i2);
        hotels.add(i3);
        hotels.add(i4);
        hotels.add(i5);
        hotels.add(i6);
        hotels.add(i7);


        itemsAdapter itemsAdapter = new itemsAdapter(this, 0, hotels);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);
    }
}