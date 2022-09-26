package com.example.arsapp2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHor extends RecyclerView.ViewHolder {
    private TextView textViewAnimal;

    public AnimalViewHor(@NonNull View itemView) {
        super(itemView);
        textViewAnimal= itemView.findViewById(R.id.textView_animal);
    }
    public void bind(String animal){
        textViewAnimal.setText(animal);
    }
}
