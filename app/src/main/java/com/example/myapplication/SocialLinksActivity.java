package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SocialLinksActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_links);
        TextView tvSocialLink = findViewById(R.id.tvSocialLink);
        // Placeholder logic for social links
        TextView tvSocialLinks = findViewById(R.id.tvSocialLinks);
//        tvSocialLinks.setText("Follow us on Twitter!");
    }
}

