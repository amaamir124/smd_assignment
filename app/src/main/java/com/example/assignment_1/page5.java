package com.example.assignment_1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class page5 extends AppCompatActivity{

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecycylerViewAdapter recycylerViewAdapter;
    int []arr = {R.drawable.spotit,R.drawable.iphone,R.drawable.mapicon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page5);

       recyclerView=findViewById(R.id.recycleritem1);
       layoutManager=new GridLayoutManager(this,2);
       recyclerView.setLayoutManager(layoutManager);
        recycylerViewAdapter=new RecycylerViewAdapter(arr);

        recyclerView.setAdapter(recycylerViewAdapter);
        recyclerView.setHasFixedSize(true);
    }

}




