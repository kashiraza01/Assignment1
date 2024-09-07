package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;


public class SecondSenderActivty  extends  AppCompatActivity{
    private EditText emailETField, contactInfoETField ,fullNameETField, addressETField,  countryEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sender_acitivity_second);

        emailETField = findViewById(R.id.emailETField);
        fullNameETField = findViewById(R.id.fullNameETField);
        contactInfoETField = findViewById(R.id.contactInfoETField);
        countryEditText = findViewById(R.id.countryEditText);
        addressETField = findViewById(R.id.addressETField);

        findViewById(R.id.navButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondSenderActivty.this, ThirdScreenActivity.class);

                // Meow Meow next page data Meow
                intent.putExtra("senderEmail", emailETField.getText().toString());
                intent.putExtra("senderFullName", fullNameETField.getText().toString());
                intent.putExtra("senderContactInfo", contactInfoETField.getText().toString());
                intent.putExtra("senderCountry", countryEditText.getText().toString());
                intent.putExtra("senderAddress", addressETField.getText().toString());

                startActivity(intent);
            }
        });
    }
}
