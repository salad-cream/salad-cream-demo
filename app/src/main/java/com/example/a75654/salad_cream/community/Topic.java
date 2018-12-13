package com.example.a75654.salad_cream.community;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.a75654.salad_cream.R;

public class Topic extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.community_topic,null);
        Glide.with(Topic.this).load(R.mipmap.topic1).into((ImageView) view.findViewById(R.id.topic_1));

        return view;
    }
}
