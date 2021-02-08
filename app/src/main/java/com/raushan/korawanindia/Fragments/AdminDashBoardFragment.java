package com.raushan.korawanindia.Fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raushan.korawanindia.R;
import com.raushan.korawanindia.activities.AddEmployee;
import com.raushan.korawanindia.activities.AllGeneratedReport;
import com.raushan.korawanindia.activities.AppSetting;
import com.raushan.korawanindia.activities.CloudBackup;
import com.raushan.korawanindia.activities.EmployeeList;
import com.raushan.korawanindia.activities.MarkAttendence;
import com.raushan.korawanindia.activities.SalarySlips;
import com.raushan.korawanindia.activities.Summaryreport;

public class AdminDashBoardFragment extends Fragment {

    CardView addEmployeeCardView, employeeListCardView,
            markAttendenceCardView, salarySlipCardView,
            summaryreportCardView, allGeneratedReportCardView,
            appSettingCardView, cloudBackUpCardView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_admin_dash_board_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        addEmployeeCardView = view.findViewById(R.id.addEmployeeCardView);
        employeeListCardView = view.findViewById(R.id.employeeListCardView);
        markAttendenceCardView = view.findViewById(R.id.markAttendenceCardView);
        salarySlipCardView = view.findViewById(R.id.salarySlipCardView);
        summaryreportCardView = view.findViewById(R.id.summaryreportCardView);
        cloudBackUpCardView = view.findViewById(R.id.cloudBackUpCardView);
        allGeneratedReportCardView = view.findViewById(R.id.allGeneratedReportCardView);
        appSettingCardView = view.findViewById(R.id.appSettingCardView);


        addEmployeeCardView.setOnClickListener(v -> {

            startActivity(new Intent(view.getContext(), AddEmployee.class));
        });

        employeeListCardView.setOnClickListener(v -> {
            startActivity(new Intent(view.getContext(), EmployeeList.class));
        });

        markAttendenceCardView.setOnClickListener(v -> {
            startActivity(new Intent(view.getContext(), MarkAttendence.class));
        });

        salarySlipCardView.setOnClickListener(v -> {
            startActivity(new Intent(view.getContext(), SalarySlips.class));
        });

        summaryreportCardView.setOnClickListener(v -> {
            startActivity(new Intent(view.getContext(), Summaryreport.class));
        });

        cloudBackUpCardView.setOnClickListener(v -> {
            startActivity(new Intent(view.getContext(), CloudBackup.class));
        });

        allGeneratedReportCardView.setOnClickListener(v -> {
            startActivity(new Intent(view.getContext(), AllGeneratedReport.class));
        });

        appSettingCardView.setOnClickListener(v -> {
            startActivity(new Intent(view.getContext(), AppSetting.class));
        });

    }

}