package com.raushan.korawanindia.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.raushan.korawanindia.Fragments.AddEmployeeFragment;
import com.raushan.korawanindia.Fragments.EmployeeListFragment;
import com.raushan.korawanindia.Fragments.GenerateReportFragment;
import com.raushan.korawanindia.Fragments.MarkAttendanceFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter( FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0:
                return new AddEmployeeFragment();
            case 1:
                return new EmployeeListFragment();
            case 2:
                return new MarkAttendanceFragment();
            case 3:
                return new GenerateReportFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
