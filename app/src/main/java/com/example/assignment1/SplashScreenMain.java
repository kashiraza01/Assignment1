package com.example.assignment1;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;


public class SplashScreenMain extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_main_01);

        // Navigate to Sender Info Activity after 3 seconds
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreenMain.this, SenderDetailsActivity.class);
            startActivity(intent);
            finish();
        }, 5000);
    };
};