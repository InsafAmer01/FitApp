package com.example.fitapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    private Button btnCreate;
    private EditText txtName;
    private EditText txtWeight;
    private EditText txtHeight;
    private EditText txtAge;
    private EditText txtEmail;
    private EditText txtPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnCreate = findViewById(R.id.btnCreate);
        txtName = findViewById(R.id.txtName);
        txtWeight = findViewById(R.id.txtWeight);
        txtHeight = findViewById(R.id.txtHeight);
        txtAge = findViewById(R.id.txtAge);
        txtEmail = findViewById(R.id.txtEmail);
        txtPass = findViewById(R.id.txtPass);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtName != null){
                    if (txtEmail != null){
                        if (txtPass != null){
                            startActivity(new Intent(SignUpActivity.this, WindowActivity.class));
                        }
                    }

                }
            }
        });
    }
}