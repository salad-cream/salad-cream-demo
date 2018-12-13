package com.example.a75654.salad_cream.community;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.a75654.salad_cream.R;

public class Popular extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.community_popular,null);
        Glide.with(Popular.this).load(R.mipmap.popular_1).into((ImageView) view.findViewById(R.id.popular1));
        Glide.with(Popular.this).load(R.mipmap.popular_2).into((ImageView) view.findViewById(R.id.popular2));
        Glide.with(Popular.this).load(R.mipmap.popular_3).into((ImageView) view.findViewById(R.id.popular3));
        Glide.with(Popular.this).load(R.mipmap.popular_4).into((ImageView) view.findViewById(R.id.popular4));

        Glide.with(Popular.this).load(R.mipmap.h1).into((ImageView) view.findViewById(R.id.head1));
        Glide.with(Popular.this).load(R.mipmap.h2).into((ImageView) view.findViewById(R.id.head2));
        Glide.with(Popular.this).load(R.mipmap.h3).into((ImageView) view.findViewById(R.id.head3));
        Glide.with(Popular.this).load(R.mipmap.h4).into((ImageView) view.findViewById(R.id.head4));

        Glide.with(Popular.this).load(R.mipmap.like).into((ImageView) view.findViewById(R.id.like1));
        Glide.with(Popular.this).load(R.mipmap.like).into((ImageView) view.findViewById(R.id.like2));
        Glide.with(Popular.this).load(R.mipmap.like).into((ImageView) view.findViewById(R.id.like3));
        Glide.with(Popular.this).load(R.mipmap.like).into((ImageView) view.findViewById(R.id.like4));
        return view;
    }
}
