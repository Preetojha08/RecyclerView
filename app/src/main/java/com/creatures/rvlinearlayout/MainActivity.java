package com.creatures.rvlinearlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<String> titles;
    List<String> sub_titles;
    List<Integer> images;
    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titles = new ArrayList<>();
        sub_titles = new ArrayList<>();
        images = new ArrayList<>();

        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);

        titles.add("First Item");
        titles.add("Second Item");
        titles.add("Third Item");
        titles.add("Fourth Item");

        titles.add("First Item");
        titles.add("Second Item");
        titles.add("Third Item");
        titles.add("Fourth Item");

        sub_titles.add("First Item 1");
        sub_titles.add("First Item 2");
        sub_titles.add("First Item 3");
        sub_titles.add("First Item 4");

        sub_titles.add("First Item 5");
        sub_titles.add("First Item 6");
        sub_titles.add("First Item 7");
        sub_titles.add("First Item 8");

        images.add(R.drawable.ic_person);
        images.add(R.drawable.ic_person);
        images.add(R.drawable.ic_person);
        images.add(R.drawable.ic_person);

        images.add(R.drawable.ic_person);
        images.add(R.drawable.ic_person);
        images.add(R.drawable.ic_person);
        images.add(R.drawable.ic_person);

        adapter = new RecyclerAdapter(this,titles,sub_titles,images);

        //For Grid Layout
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        //recyclerView.setLayoutManager(gridLayoutManager);

        //For Linear Layout
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);


    }
}