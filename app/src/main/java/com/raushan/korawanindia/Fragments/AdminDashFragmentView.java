package com.raushan.korawanindia.Fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.raushan.korawanindia.Adapters.ViewPagerAdapter;
import com.raushan.korawanindia.R;

public class AdminDashFragmentView extends AppCompatActivity {

    ViewPager2 myViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dash_fragment_view);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Add\n Employee"));
        tabLayout.addTab(tabLayout.newTab().setText("Employee\n List"));
        tabLayout.addTab(tabLayout.newTab().setText("Mark\n Attendence"));
        tabLayout.addTab(tabLayout.newTab().setText("Generate\n  Report"));
        tabLayout.addTab(tabLayout.newTab().setText("Salary\n slip"));
        tabLayout.addTab(tabLayout.newTab().setText("Backup"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        myViewPager = findViewById(R.id.myViewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), getLifecycle());
        myViewPager.setAdapter(viewPagerAdapter);

//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        AddEmployeeFragment addEmployeeFragment = new AddEmployeeFragment();
//        fragmentTransaction.add(R.id.mainLayout, addEmployeeFragment);
//        fragmentTransaction.commit();


        myViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                myViewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}