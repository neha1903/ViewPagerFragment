package com.fragment.viewpagerfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Main Activity";

    private SectionsStatePagerAdapter mSectionStatePAgeAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "On Create : Started");

        mSectionStatePAgeAdapter = new SectionsStatePagerAdapter(getSupportFragmentManager());

        mViewPager =  findViewById(R.id.container);
        setUpViewPager(mViewPager);


    }

    private void setUpViewPager(ViewPager viewPager){
        SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CustomFragment(), "Fragment1");
        adapter.addFragment(new CustomFragment(), "Fragment1");
        adapter.addFragment(new CustomFragment(), "Fragment1");
        viewPager.setAdapter(adapter);
    }


}
