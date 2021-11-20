package com.example.rcvcardviewpractive1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VerticalViewHolder extends RecyclerView.ViewHolder {
    ImageView image1;
    TextView  VerHeading , VerDescription;

    public VerticalViewHolder(@NonNull View itemView) {
        super(itemView);
        image1= (ImageView)itemView.findViewById(R.id.idIVNews);
        VerHeading=(TextView)itemView.findViewById(R.id.idTVNewsHeading);
        VerDescription=(TextView)itemView.findViewById(R.id.idTVSubTitle);
    }
}
