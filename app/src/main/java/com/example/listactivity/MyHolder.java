package com.example.listactivity;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView mPoster;
    TextView mTitle, mYear;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mPoster = itemView.findViewById(R.id.movie_poster);
        this.mTitle = itemView.findViewById(R.id.movie_title);
        this.mYear = itemView.findViewById(R.id.movie_year);
    }
}

