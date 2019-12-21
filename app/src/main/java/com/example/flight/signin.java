package com.example.flight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signin extends AppCompatActivity {
    private EditText inputName, inputPassword;
    private Button btnSignIn, btnBack;
    private String email="abc@gmail.com";
    private String password1="abc123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        findViews();
        setListeners();
    }

    private void findViews(){
        inputName = findViewById(R.id.edtEmailSignIn);
        inputPassword = findViewById(R.id.edtPasswordSignIn);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnBack = findViewById(R.id.btnBack);
    }

    private void setListeners(){
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = inputName.getText().toString();
                String password = inputPassword.getText().toString();
                if (name.isEmpty() && password.isEmpty()){
                    Toast.makeText(signin.this, "Please insert your email and password", Toast.LENGTH_SHORT).show();
                }
                else if(name.isEmpty()){
                    Toast.makeText(signin.this, "Please insert your email", Toast.LENGTH_SHORT).show();
                } else if (password.isEmpty()){
                    Toast.makeText(signin.this, "Please insert your password", Toast.LENGTH_SHORT).show();
                } else {
                    if ((email.equals(name)) && (password1.equals(password))) {
                        Intent i = new Intent(signin.this, after_signin.class);
                        startActivity(i);
                    }else if (!email.equals(name)){
                        Toast.makeText(signin.this, "Wrong email", Toast.LENGTH_SHORT).show();
                    } else if (!password1.equals(password)){
                        Toast.makeText(signin.this, "Wrong password", Toast.LENGTH_SHORT).show();
                    }

                }
                }

        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(signin.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
