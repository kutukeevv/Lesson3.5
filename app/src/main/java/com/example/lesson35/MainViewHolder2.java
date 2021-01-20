package com.example.lesson35;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder2 extends RecyclerView.ViewHolder{
    ImageView img1;

    public MainViewHolder2(@NonNull View itemView) {
        super(itemView);
        img1 = itemView.findViewById(R.id.image1);
    }

    public void onBind(Data2 data2){
        img1.setImageResource(data2.image);

    }

}
