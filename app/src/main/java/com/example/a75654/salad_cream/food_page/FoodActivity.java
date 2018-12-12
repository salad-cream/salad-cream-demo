package com.example.a75654.salad_cream.food_page;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.astuetz.PagerSlidingTabStrip;
import com.example.a75654.salad_cream.R;

import java.util.ArrayList;
import java.util.List;

public class FoodActivity extends AppCompatActivity{
    private final String[] titles = {"食谱","原料","酱汁"};
    ArrayList<Fragment> fragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        if (pager == null){
            Log.i("null","null");
        }

        fragments = new ArrayList<>();
        RecipesFragment recipesFragment = new RecipesFragment();
        MaterialsFragment materialsFragment = new MaterialsFragment();
        SauceFragment sauceFragment = new SauceFragment();
        //添加fragment到集合中时注意顺序
        fragments.add(recipesFragment);
        fragments.add(materialsFragment);
        fragments.add(sauceFragment);

        pager.setAdapter(new TextAdapter(getSupportFragmentManager(), titles, fragments));

        // 设置Tab底部选中的指示器 Indicator的颜色
        tabs.setIndicatorColor(Color.BLACK);
        //设置Tab标题文字的颜色
        tabs.setTextColor(Color.BLACK);
        // 设置Tab标题文字的大小
        tabs.setTextSize(50);
        //设置Tab底部分割线的颜色
        tabs.setUnderlineColor(Color.TRANSPARENT);
        // 设置点击某个Tab时的背景色,设置为0时取消背景色
        tabs.setTabBackground(0);
        // 设置Tab是自动填充满屏幕的
        tabs.setShouldExpand(true);
        //!!!设置选中的Tab文字的颜色!!!
        //tabs.setSelectedTextColor(Color.GREEN);
        //tab间的分割线
        tabs.setDividerColor(Color.GRAY);
        //与ViewPager关联，这样指示器就可以和ViewPager联动
        tabs.setViewPager(pager);
    }
    class TextAdapter extends FragmentPagerAdapter {
        String[] titles;
        List<Fragment> lists = new ArrayList<>();

        public TextAdapter(FragmentManager fm, String[] titles, List<Fragment> list) {
            super(fm);
            this.titles = titles;
            this.lists = list;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        @Override
        public Fragment getItem(int position) {
            return lists.get(position);
        }

        @Override
        public int getCount() {
            return lists.size();
        }
    }

}
