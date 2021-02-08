package com.raushan.korawanindia.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import com.raushan.korawanindia.Fragments.AdminDashBoardFragment;
import com.raushan.korawanindia.R;
import com.raushan.korawanindia.activities.AddEmployee;
import com.raushan.korawanindia.activities.AllGeneratedReport;
import com.raushan.korawanindia.activities.AppSetting;
import com.raushan.korawanindia.activities.CloudBackup;
import com.raushan.korawanindia.activities.EmployeeList;
import com.raushan.korawanindia.activities.MarkAttendence;
import com.raushan.korawanindia.activities.SalarySlips;
import com.raushan.korawanindia.activities.Summaryreport;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class NavDraw extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(NavDraw.this, drawer, toolbar, R.string.closedrawer, R.string.opendrawer);
        actionBarDrawerToggle.syncState();


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        AdminDashBoardFragment adminDashBoardFragment = new AdminDashBoardFragment();
        fragmentTransaction.add(R.id.mainLayout,adminDashBoardFragment);
        fragmentTransaction.commit();



  }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,  menu);
        return super.onCreateOptionsMenu(menu);
    }
}