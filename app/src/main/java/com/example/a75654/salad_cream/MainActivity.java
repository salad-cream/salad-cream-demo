package com.example.a75654.salad_cream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.a75654.salad_cream.community.CommunityActivity;
import com.example.a75654.salad_cream.food_page.FoodActivity;
import com.example.a75654.salad_cream.store.store;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_center);
        Glide.with(getApplicationContext()).load(R.mipmap.foodicon).into((ImageView) findViewById(R.id.foodicon4));
        Glide.with(getApplicationContext()).load(R.mipmap.store).into((ImageView) findViewById(R.id.store4));
        Glide.with(getApplicationContext()).load(R.mipmap.community).into((ImageView) findViewById(R.id.community4));
        Glide.with(getApplicationContext()).load(R.mipmap.me).into((ImageView) findViewById(R.id.me4));
        ((ImageView)findViewById(R.id.foodicon4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FoodActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        });
        ((ImageView)findViewById(R.id.store4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, store.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        });((ImageView)findViewById(R.id.community4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CommunityActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        });
        ((ImageView)findViewById(R.id.me4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, MainActivity.class);
//                startActivity(intent);
            }
        });

    }
}
