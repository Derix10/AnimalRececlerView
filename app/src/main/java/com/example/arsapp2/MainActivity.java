package com.example.arsapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_view);
        ArrayList<String> animals = new ArrayList<>();
        AnimalAdapter adapter1 = new AnimalAdapter(animals);
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");
        animals.add("Elephant");
        animals.add("TIger");
        animals.add("Lian");
        animals.add("Horse");
        animals.add("Monkey");
        animals.add("Crocodile");
        animals.add("Shark");
        animals.add("Fish");
        animals.add("Giraf");
        recyclerView.setAdapter(adapter1);
    }
}