package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AttendanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        // Firebase Database Reference
        DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference("attendance");

        // Example: Fetch and display attendance
        dbRef.child("student1").get().addOnCompleteListener(task -> {
            if (task.isSuccessful() && task.getResult().exists()) {
                String attendance = task.getResult().child("status").getValue(String.class);
                Toast.makeText(this, "Attendance: " + attendance, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Attendance data not available", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
