package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


    public class Prashala extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button btnAttendance = findViewById(R.id.btnAttendance);
            Button btnHomework = findViewById(R.id.btnHomework);
            Button btnTimetable = findViewById(R.id.btnTimetable);
            Button btnNotice = findViewById(R.id.btnNotice);
            Button btnCalendar = findViewById(R.id.btnCalendar);
            Button btnFeeStatus = findViewById(R.id.btnFeeStatus);
            Button btnSocialLinks = findViewById(R.id.btnSocialLinks);
            Button btnLessonPlanning = findViewById(R.id.btnLessonPlanning);
            Button btnStaff = findViewById(R.id.btnStaff);

            btnAttendance.setOnClickListener(v -> {
                // Handle attendance logic or navigate to another activity
                startActivity(new Intent(Prashala.this, AttendanceActivity.class));
            });

            btnHomework.setOnClickListener(v -> {
                // Handle homework logic or navigate to another activity
                startActivity(new Intent(Prashala.this, HomeworkActivity.class));
            });

            btnTimetable.setOnClickListener(v -> {
                // Handle timetable logic or navigate to another activity
                startActivity(new Intent(Prashala.this, TimetableActivity.class));
            });

            btnNotice.setOnClickListener(v -> {
                // Handle notice logic or navigate to another activity
                startActivity(new Intent(Prashala.this, NoticeActivity.class));
            });

            btnCalendar.setOnClickListener(v -> {
                // Handle calendar logic or navigate to another activity
                startActivity(new Intent(Prashala.this, CalendarActivity.class));
            });

            btnFeeStatus.setOnClickListener(v -> {
                // Handle fee status logic or navigate to another activity
                startActivity(new Intent(Prashala.this, FeeStatusActivity.class));
            });

            btnSocialLinks.setOnClickListener(v -> {
                // Handle social links logic or navigate to another activity
                startActivity(new Intent(Prashala.this, SocialLinksActivity.class));
            });

            btnLessonPlanning.setOnClickListener(v -> {
                // Handle lesson planning logic or navigate to another activity
                startActivity(new Intent(Prashala.this, LessonPlanningActivity.class));
            });

            btnStaff.setOnClickListener(v -> {
                // Handle staff logic or navigate to another activity
                startActivity(new Intent(Prashala.this, StaffActivity.class));
            });
        }
    }
