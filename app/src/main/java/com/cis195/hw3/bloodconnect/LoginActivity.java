package com.cis195.hw3.bloodconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginButton() {


    }

    public boolean validate() {
        boolean isValid = true;
        EditText editTextEmail = findViewById(R.id.input_email);
        EditText editTextPassword = findViewById(R.id.input_email);
        String inputEmail = editTextEmail.getText().toString();
        String inputPassword = editTextPassword.getText().toString();

        if (inputEmail.equals("") || android.util.Patterns.EMAIL_ADDRESS.matcher(inputEmail).matches()) {
            isValid = false;
            editTextEmail.setError("Please enter a valid email");
        }
        if (inputPassword.equals("") || inputPassword.length() < 4 || inputPassword.length() > 10) {
            isValid = false;
            editTextPassword.setError("Please enter a password");
        }
        return isValid;
    }


    public void saveLoginInformation(String username, String password) {
        
    }




}
