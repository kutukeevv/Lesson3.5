package com.example.lesson35;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter2 extends RecyclerView.Adapter<MainViewHolder2>{
    ArrayList<Data2> list1;
    public void addImage(ArrayList<Data2> data1){
        list1 = data1;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.image_list, parent, false);
        return new MainViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder2 holder, int position) {
        holder.onBind(list1.get(position));

    }

    @Override
    public int getItemCount() {
        return list1.size();
    }
}
