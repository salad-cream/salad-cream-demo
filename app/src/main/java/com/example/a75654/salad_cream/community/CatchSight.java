package com.example.a75654.salad_cream.community;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.a75654.salad_cream.R;

public class CatchSight extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.community_catch_sight,null);

        Glide.with(CatchSight.this).load(R.mipmap.catchsight1).into((ImageView) view.findViewById(R.id.catchsight1));
        Glide.with(CatchSight.this).load(R.mipmap.catchsight2).into((ImageView) view.findViewById(R.id.catchsight2));

        return view;
    }
}
