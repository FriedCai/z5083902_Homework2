package com.example.food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder>{
    Context context;
    ArrayList<Item> items;
    public CartAdapter(Context context, ArrayList<Item> items) {
        this.items = items;
        this.context= context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = items.get(position);
        holder.imageView.setBackgroundResource(item.image);
        holder.textView_name.setText(item.name);
        holder.textView_price.setText(item.price+"$ X"+item.count);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView_name;
        TextView textView_price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview1);
            textView_name = itemView.findViewById(R.id.textView_name);
            textView_price = itemView.findViewById(R.id.textView_price);

        }


    }

}
