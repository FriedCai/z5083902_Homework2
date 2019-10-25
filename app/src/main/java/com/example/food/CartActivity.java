package com.example.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    private ArrayList<Item> list;
    private double totalPrice=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        RecyclerView recycleView = findViewById(R.id.recycleview);
        TextView total = findViewById(R.id.total);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
        list = ItemDatabase.getCart();
        for (Item item :
                list) {
            totalPrice+=item.count*item.price;
        }
        total.setText("Total:$"+totalPrice);
        CartAdapter adapter = new CartAdapter(this,list);
        recycleView.setAdapter(adapter);
    }
}
