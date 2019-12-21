package com.example.flight;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Button;



import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class BookingPage extends AppCompatActivity  {
    private Button btnSubmit,btnLogout, btnBack;
    private Spinner spnDestination;
    private ArrayAdapter<CharSequence> adapterLoc;
    private TextView tvPricePerTicket;
    private OkHttpClient okHttpClient = new OkHttpClient();
    private ArrayList<BookingTicketModel> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_page);

        findViews();

        adapterLoc = ArrayAdapter.createFromResource(this,R.array.location, android.R.layout.simple_spinner_item);
        adapterLoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spnDestination.setAdapter(adapterLoc);

        setListeners();
    }

    private void findViews(){
        btnSubmit = findViewById(R.id.btnSubmit);
        btnLogout = findViewById(R.id.btnLogout);
        spnDestination = findViewById(R.id.spnDestination);
    }

    private void setListeners(){
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BookingPage.this,LastPage.class);
                startActivity(i);
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BookingPage.this,signin.class);
                startActivity(i);
            }
        });

    }

    }





