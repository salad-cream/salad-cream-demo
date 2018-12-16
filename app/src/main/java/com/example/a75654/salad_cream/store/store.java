package com.example.a75654.salad_cream.store;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.a75654.salad_cream.MainActivity;
import com.example.a75654.salad_cream.R;
import com.example.a75654.salad_cream.community.CommunityActivity;
import com.example.a75654.salad_cream.food_page.FoodActivity;


public class store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        Glide.with(getApplicationContext()).load(R.mipmap.foodicon).into((ImageView) findViewById(R.id.foodicon3));
        Glide.with(getApplicationContext()).load(R.mipmap.store).into((ImageView) findViewById(R.id.store3));
        Glide.with(getApplicationContext()).load(R.mipmap.community).into((ImageView) findViewById(R.id.community3));
        Glide.with(getApplicationContext()).load(R.mipmap.me).into((ImageView) findViewById(R.id.me3));
        Glide.with(store.this).load(R.mipmap.shopping).into((ImageView) findViewById(R.id.imageButton));
        Glide.with(store.this).load(R.mipmap.search).into((ImageView) findViewById(R.id.imageButton2));
        Glide.with(store.this).load(R.mipmap.longan).into((ImageView) findViewById(R.id.imageButton3));
        Glide.with(store.this).load(R.mipmap.ad).into((ImageView) findViewById(R.id.imageView2));
        Glide.with(store.this).load(R.mipmap.pemelo).into((ImageView) findViewById(R.id.imageButton5));
        Glide.with(store.this).load(R.mipmap.pawpaw).into((ImageView) findViewById(R.id.imageButton6));
        Glide.with(store.this).load(R.mipmap.orange).into((ImageView) findViewById(R.id.imageButton7));
        Glide.with(store.this).load(R.mipmap.apple).into((ImageView) findViewById(R.id.imageButton8));
        Glide.with(store.this).load(R.mipmap.broccoli).into((ImageView) findViewById(R.id.imageButton10));
        Glide.with(store.this).load(R.mipmap.lettuce).into((ImageView) findViewById(R.id.imageButton11));
        Glide.with(store.this).load(R.mipmap.cabbage).into((ImageView) findViewById(R.id.imageButton12));
        Glide.with(store.this).load(R.mipmap.tomato).into((ImageView) findViewById(R.id.imageButton13));
        Glide.with(store.this).load(R.mipmap.sweetpotato).into((ImageView) findViewById(R.id.imageButton14));
        Glide.with(store.this).load(R.mipmap.sale).into((ImageView) findViewById(R.id.sale));
        ((ImageView)findViewById(R.id.foodicon3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(store.this, FoodActivity.class);
                startActivity(intent);
            }
        });
        ((ImageView)findViewById(R.id.store3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(store.this, store.class);
//                startActivity(intent);
            }
        });((ImageView)findViewById(R.id.community3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(store.this, CommunityActivity.class);
                startActivity(intent);
            }
        });
        ((ImageView)findViewById(R.id.me3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(store.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
