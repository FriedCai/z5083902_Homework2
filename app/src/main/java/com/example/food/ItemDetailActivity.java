package com.example.food;


import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetailActivity extends AppCompatActivity {

    private Button btA,btB,btC;
    private Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        int itemID = getIntent().getIntExtra("ItemId", -1);
         item = ItemDatabase.getItemById(itemID);

        ImageView image = findViewById(R.id.image);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textViewPrice = findViewById(R.id.textView_price);
        textViewPrice.setText("$ "+item.price);
        btA = findViewById(R.id.bt_a);
        btB= findViewById(R.id.bt_b);
        btC = findViewById(R.id.bt_c);
        image.setBackgroundResource(item.image);
        textView.setText(item.name);
        textView2.setText(item.detail);
        btA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = btB.getText().toString();
                int num = Integer.parseInt(str);
                if (num-1>0){
                    btB.setText(num-1+"");
                }
            }
        });
        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = btB.getText().toString();
                int num = Integer.parseInt(str);
                btB.setText(num+1+"");
            }
        });
        findViewById(R.id.bottom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = btB.getText().toString();
                int num = Integer.parseInt(str);
                ItemDatabase.addItem(num,item);
                finish();
            }
        });
    }
}
