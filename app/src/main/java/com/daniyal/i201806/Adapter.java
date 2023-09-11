package com.daniyal.i201806;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<MyViewHolder> {

    Context c;
    List<Model> ls;

    public Adapter(Context c, List<Model> ls) {
        this.c = c;
        this.ls = ls;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View row = LayoutInflater.from(c).inflate(R.layout.row,parent,false);
        return new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
