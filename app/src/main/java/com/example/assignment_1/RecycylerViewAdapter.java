package com.example.assignment_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycylerViewAdapter extends RecyclerView.Adapter<RecycylerViewAdapter.myViewHolder> {
    int arr[];
    public RecycylerViewAdapter(int[] arr) {
        this.arr = arr;
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.page5,parent,false);
       myViewHolder myViewHolder=new myViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
    holder.item.setImageResource(arr[position]);
    holder.itemName.setText("image num"+position);
    holder.city.setText("Islamabad");
    holder.date.setText("7th Oct");
    holder.price.setText("7$/hr");
    }

    @Override
    public int getItemCount() {
        return arr.length;
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        ImageView item;
        TextView itemName;
        TextView price;
        TextView date;
        TextView city;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            item=itemView.findViewById(R.id.item);
            itemName=itemView.findViewById(R.id.name);
            price=itemView.findViewById(R.id.price);
            date=itemView.findViewById(R.id.date);
            city=itemView.findViewById(R.id.city);

        }
    }
}
