package com.example.arsapp2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHor> {
    private ArrayList<String> animals = new ArrayList<>();

    public AnimalAdapter(ArrayList<String> animals) {
        this.animals = animals;
    }

    @NonNull
    @Override
    public AnimalViewHor onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimalViewHor(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHor holder, int position) {
     holder.bind(animals.get(position));
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}
