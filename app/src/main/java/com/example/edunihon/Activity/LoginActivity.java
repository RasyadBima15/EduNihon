package com.example.edunihon.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.edunihon.R;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    String username, password;
    SharedPreferences preferencesLogin, preferences;
    boolean login_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        preferencesLogin = this.getSharedPreferences("login_status", MODE_PRIVATE);
        login_status = preferencesLogin.getBoolean("login", false);
        if (login_status){
            Intent intent = new Intent(this, MainActivity.class);
            finish();
            startActivity(intent);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextInputEditText usernameTv = findViewById(R.id.username);
        TextInputEditText passwordTv = findViewById(R.id.password);
        LinearLayout login = findViewById(R.id.login_btn);

        login.setOnClickListener( v -> {
            preferences = this.getSharedPreferences("user_pref", MODE_PRIVATE);
            username = preferences.getString("username", "");
            password = preferences.getString("password", "");
            if (usernameTv.getText().toString().equals("")){
                usernameTv.setError("NIM harus diisi!");
                return;
            }else if (passwordTv.getText().toString().equals("")){
                passwordTv.setError("Password harus diisi!");
                return;
            }
            if (username.equals(usernameTv.getText().toString()) && password.equals(passwordTv.getText().toString())){
                SharedPreferences.Editor editor = preferencesLogin.edit();
                editor.putBoolean("login", true);
                editor.apply();

                Intent intent = new Intent(this, MainActivity.class);
                finish();
                startActivity(intent);
            } else {
                Toast.makeText(this, "Username atau Password salah!", Toast.LENGTH_LONG).show();
            }
        });

        TextView register = findViewById(R.id.register_btn);
        register.setOnClickListener( v -> {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
            finish();
        });
    }
}