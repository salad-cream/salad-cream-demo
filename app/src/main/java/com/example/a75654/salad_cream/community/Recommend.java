package com.example.a75654.salad_cream.community;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.a75654.salad_cream.R;

public class Recommend extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.community_recommend,null);

        Glide.with(Recommend.this).load(R.mipmap.recommend1).into((ImageView) view.findViewById(R.id.recommend1));
        Glide.with(Recommend.this).load(R.mipmap.recommend2).into((ImageView) view.findViewById(R.id.recommend2));
        Glide.with(Recommend.this).load(R.mipmap.recommend3).into((ImageView) view.findViewById(R.id.recommend3));
        Glide.with(Recommend.this).load(R.mipmap.recommend4).into((ImageView) view.findViewById(R.id.recommend4));

        return view;
    }
}
