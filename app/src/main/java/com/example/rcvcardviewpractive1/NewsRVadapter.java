package com.example.rcvcardviewpractive1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class NewsRVadapter extends RecyclerView.Adapter<VerticalViewHolder> {
    ArrayList<Model> data;

    public NewsRVadapter(ArrayList<Model> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=  LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.new_rv_item,parent,false);
        return new VerticalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalViewHolder holder, int position) {
        holder.VerHeading.setText(data.get(position).getVheading());
        holder.VerDescription.setText(data.get(position).getVdescription());
        holder.image1.setImageResource(data.get(position).getVimgname());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
