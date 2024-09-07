package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LastActivity extends AppCompatActivity {
    private TextView sndrNameTextView, sndrCountryTextView, sndrAddressTextView, sndrContactInfoTextView;
    private TextView rcvrNameTextView, rcvrCountryTextView, rcvrAddressTextView, rcvrContactInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info_last);

        sndrNameTextView = findViewById(R.id.sndrNameTextView);
        sndrCountryTextView = findViewById(R.id.sndrCountryTextView);
        sndrAddressTextView = findViewById(R.id.sndrAddressTextView);
        sndrContactInfoTextView = findViewById(R.id.sndrContactInfoTextView);

        rcvrNameTextView = findViewById(R.id.rcvrNameTextView);
        rcvrCountryTextView = findViewById(R.id.rcvrCountryTextView);
        rcvrAddressTextView = findViewById(R.id.rcvrAddressTextView);
        rcvrContactInfoTextView = findViewById(R.id.rcvrContactInfoTextView);

        Intent intent = getIntent();
        String rcvrName = intent.getStringExtra("receiverFullName");
        String rcvrCountry = intent.getStringExtra("receiverCountry");
        String rcvrAddress = intent.getStringExtra("receiverAddress");
        String rcvrContactInfo = intent.getStringExtra("receiverContactInfo");

        rcvrNameTextView.setText(rcvrName);
        rcvrCountryTextView.setText(rcvrCountry);
        rcvrAddressTextView.setText(rcvrAddress);
        rcvrContactInfoTextView.setText(rcvrContactInfo);

        String sndrName = intent.getStringExtra("senderFullName");
        String sndrCountry = intent.getStringExtra("senderCountry");
        String sndrAddress = intent.getStringExtra("senderAddress");
        String sndrContactInfo = intent.getStringExtra("senderContactInfo");

        sndrNameTextView.setText(sndrName);
        sndrCountryTextView.setText(sndrCountry);
        sndrAddressTextView.setText(sndrAddress);
        sndrContactInfoTextView.setText(sndrContactInfo);


    }
}
