package com.example.tablayout_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    AppBarLayout appBarLayout;
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tabs);
        viewPager=findViewById(R.id.view_pager);

        SwipeAdapter swipeAdapter=new SwipeAdapter(getSupportFragmentManager());
        viewPager.setAdapter(swipeAdapter);

        swipeAdapter.addFragment(new Fragment_One(),"INFO");
        swipeAdapter.addFragment(new Fragment_Two(),"LIVE");
        swipeAdapter.addFragment(new Fragment_Three(),"SCORECARD");
        tabLayout.setupWithViewPager(viewPager);

    }
}