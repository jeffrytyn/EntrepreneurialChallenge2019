package com.example.jeffreyt.challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button button = findViewById(R.id.loginButton);
        username = findViewById(R.id.Username);
        password = findViewById(R.id.Password);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameString = username.getText().toString();
                String passwordString = password.getText().toString();
                if (usernameString.length() > 0 && passwordString.length() > 0) {
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Enter username and password", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
    }
}