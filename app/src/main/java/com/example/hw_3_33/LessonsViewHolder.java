package com.example.hw_3_33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LessonsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvLessons;

    public LessonsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvLessons = itemView.findViewById(R.id.tv_lessons);
    }

    public void bind(String lessons){
        tvLessons.setText(lessons);
    }
}
