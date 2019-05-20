package org.pltw.examples.carbonfootprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText username;
private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toHome(View view) {
        username = findViewById(R.id.Username);
        String usernameString = username.getText().toString();
        password = findViewById(R.id.Password);
        String passwordString = password.getText().toString();
        if(!TextUtils.isEmpty(usernameString)&&!TextUtils.isEmpty(passwordString)) {
            Intent intent = new Intent(this, HomeScreen.class);
            startActivity(intent);
        }else{
            Toast toast = Toast.makeText(getApplicationContext(), "Enter username and password", Toast.LENGTH_SHORT);
            toast.show();

        }
    }
}
