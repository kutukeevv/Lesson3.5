package com.example.lesson35;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv1;
    RecyclerView rv2;
    MainAdapter adapter;
    MainAdapter2 adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv1 = findViewById(R.id.r1);
        rv2 = findViewById(R.id.r2);

        adapter = new MainAdapter();
        adapter1 = new MainAdapter2();

        rv1.setAdapter(adapter);
        rv2.setAdapter(adapter1);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager manager1= new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        rv1.setLayoutManager(manager);
        rv2.setLayoutManager(manager1);

        ArrayList<Data> list = new ArrayList<>();

        list.add(0, new Data("Ruslan", "Aslanov"));
        list.add(0, new Data("Maksim", "Maksimov"));
        list.add(0, new Data("Azamat", "Kanatov"));
        list.add(0, new Data("Sadyr", "Japarov"));
        list.add(0, new Data("Sooronbai", "Jeenbekov"));
        list.add(0, new Data("Almazbek", "Atambaev"));

        adapter.addText(list);

        ArrayList<Data2> list1 = new ArrayList<>();

        list1.add(0, new Data2(R.drawable.a));
        list1.add(1,new Data2(R.drawable.b));
        list1.add(2,new Data2(R.drawable.c));
        list1.add(3,new Data2(R.drawable.d));
        adapter1.addImage(list1);







    }
}