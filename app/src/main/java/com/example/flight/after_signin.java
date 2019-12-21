package com.example.flight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class after_signin extends AppCompatActivity {
    private Button btnBookTic, btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_signin);

        findViews();
        setListeners();
    }

    private void findViews(){
        btnBookTic = findViewById(R.id.btnBookTicket);
        btnExit = findViewById(R.id.btnCheckBookingDetails);
    }

    private void setListeners(){
        btnBookTic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(after_signin.this,BookingPage.class);
                startActivity(i);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(after_signin.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
