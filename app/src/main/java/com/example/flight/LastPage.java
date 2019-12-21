package com.example.flight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LastPage extends AppCompatActivity {
    private Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_page);
        findViews();
        setListeners();

    }
    private void findViews(){
        btnHome = findViewById(R.id.btnHome);
    }

    private void setListeners(){
        btnHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            Intent i = new Intent (LastPage.this,after_signin.class);
            startActivity(i);
            }
        });
    }
}
