package com.example.lesson35;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView surname;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        surname = itemView.findViewById(R.id.surname);
    }

    public void onBind(Data data){
        name.setText(data.name);
        surname.setText(data.surname);
    }
}
