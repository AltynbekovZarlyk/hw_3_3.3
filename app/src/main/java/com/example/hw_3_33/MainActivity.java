package com.example.hw_3_33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> lessonsList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        loadData();
        LessonsAdapter adapter  = new LessonsAdapter(lessonsList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        lessonsList.add("Физика");
        lessonsList.add("Математика");
        lessonsList.add("Геометрия");
        lessonsList.add("География");
        lessonsList.add("Химия");
        lessonsList.add("Русский язык");
        lessonsList.add("Англиский язык");
        lessonsList.add("Природоведение");
        lessonsList.add("Алгебра");
        lessonsList.add("Литература");
        lessonsList.add("Физкультура");
        lessonsList.add("Биология");
        lessonsList.add("Манасоведение");
        lessonsList.add("Кыргызский язык");
        lessonsList.add("Изобразительное искуство");
    }
}