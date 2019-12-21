package com.example.flight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookingDetails extends AppCompatActivity {
    private Button btnBackDetail, btnConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_details);

        findViews();
        setListeners();
}

    private void findViews(){
        btnBackDetail = findViewById(R.id.btnSubmit);
        btnConfirm = findViewById(R.id.btnBack);
    }

    private void setListeners(){
        btnBackDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BookingDetails.this,after_signin.class);
                startActivity(i);
            }
        });

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BookingDetails.this,LastPage.class);
                startActivity(i);
            }
        });
    }
}
