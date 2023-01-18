package com.example.hw_3_33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LessonsAdapter extends RecyclerView.Adapter<LessonsViewHolder> {

    private ArrayList<String> lessonsList;

    public LessonsAdapter(ArrayList<String> lessonsList) {
        this.lessonsList = lessonsList;
    }

    @NonNull
    @Override
    public LessonsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LessonsViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lessons, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LessonsViewHolder holder, int position) {
        holder.bind(lessonsList.get(position));
    }

    @Override
    public int getItemCount() {
        return lessonsList.size();
    }
}
