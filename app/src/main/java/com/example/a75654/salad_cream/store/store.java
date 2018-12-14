package com.example.a75654.salad_cream.store;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.a75654.salad_cream.MainActivity;
import com.example.a75654.salad_cream.R;
import com.example.a75654.salad_cream.community.CommunityActivity;
import com.example.a75654.salad_cream.food_page.FoodActivity;


public class store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
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
