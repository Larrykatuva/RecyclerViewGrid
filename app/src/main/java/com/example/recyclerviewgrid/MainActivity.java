package com.example.recyclerviewgrid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private int[] images = {
            R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,
            R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,
            R.drawable.pic7, R.drawable.pic8,R.drawable.pic9,
            R.drawable.pic10, R.drawable.pic11,R.drawable.pic12,
            R.drawable.pic13,R.drawable.pic14,R.drawable.pic15
    };

    private RecyclerAdapter adapter;

    private  RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(images);
        recyclerView.setAdapter((adapter));
    }
}
