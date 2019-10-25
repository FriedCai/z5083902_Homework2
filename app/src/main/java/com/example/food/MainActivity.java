package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Item> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bottom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CartActivity.class));
            }
        });

        RecyclerView recycleView = findViewById(R.id.recycleview);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
       list = ItemDatabase.getAllItems();
        Adapter adapter = new Adapter(this,list);
        recycleView.setAdapter(adapter);
        adapter.setOnItemClickListener(new Adapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Item data = list.get(position);
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,ItemDetailActivity.class);
                intent.putExtra("ItemId",data.id);
                startActivity(intent);
            }
        });
    }



}
