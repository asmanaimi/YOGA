package com.example.yoga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.yoga.Adapter.RecyclerViewAdapter;
import com.example.yoga.Model.Exercise;
import com.example.yoga.Utils.DataInitializer;

import java.util.ArrayList;
import java.util.List;

public class ListExercisesActivity extends AppCompatActivity {

    private List<Exercise> exerciseList = new ArrayList<>();

    private RecyclerView.LayoutManager layoutManager;

    private RecyclerView recyclerView;

    private RecyclerViewAdapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_exercices);

        DataInitializer.initData(exerciseList);

        recyclerView = (RecyclerView) findViewById(R.id.list_exercises);

        recyclerViewAdapter = new RecyclerViewAdapter(exerciseList, getBaseContext());

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
