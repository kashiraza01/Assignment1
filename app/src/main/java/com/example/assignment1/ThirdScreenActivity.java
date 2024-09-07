package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdScreenActivity extends  AppCompatActivity {
    private EditText rcvrEmailETField, rcvrFullNameETField, rcvrContactInfoETField, rcvrCountryETField, rcvrAddressETField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reciever_activty_third);
        
        rcvrEmailETField = findViewById(R.id.rcvrEmailETField);

        rcvrFullNameETField = findViewById(R.id.rcvrFullNameETField);

        rcvrContactInfoETField = findViewById(R.id.rcvrContactInfoETField);

        rcvrCountryETField = findViewById(R.id.rcvrCountryETField);

        rcvrAddressETField = findViewById(R.id.rcvrAddressETField);

        findViewById(R.id.rcvrNavButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdScreenActivity.this, LastActivity.class);

                Intent senderIntent = getIntent();
                intent.putExtra("senderEmail", senderIntent.getStringExtra("senderEmail"));
                intent.putExtra("senderFullName", senderIntent.getStringExtra("senderFullName"));
                intent.putExtra("senderContactInfo", senderIntent.getStringExtra("senderContactInfo"));
                intent.putExtra("senderCountry", senderIntent.getStringExtra("senderCountry"));
                intent.putExtra("senderAddress", senderIntent.getStringExtra("senderAddress"));

                intent.putExtra("receiverEmail", rcvrEmailETField.getText().toString());
                intent.putExtra("receiverFullName", rcvrFullNameETField.getText().toString());
                intent.putExtra("receiverContactInfo", rcvrContactInfoETField.getText().toString());
                intent.putExtra("receiverCountry", rcvrCountryETField.getText().toString());
                intent.putExtra("receiverAddress", rcvrAddressETField.getText().toString());

                startActivity(intent);
            }
        });
    }
}
