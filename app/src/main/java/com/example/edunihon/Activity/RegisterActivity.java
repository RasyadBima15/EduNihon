package com.example.edunihon.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.edunihon.R;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView login = findViewById(R.id.login_btn);
        login.setOnClickListener( v -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

        TextInputEditText usernameTv = findViewById(R.id.username);
        TextInputEditText passwordTv = findViewById(R.id.password);
        LinearLayout register = findViewById(R.id.register_btn);

        register.setOnClickListener( v -> {
            username = String.valueOf(usernameTv.getText());
            password = String.valueOf(passwordTv.getText());

            if (usernameTv.getText().toString().equals("")){
                usernameTv.setError("Username harus diisi!");
                return;
            }else if (passwordTv.getText().toString().equals("")){
                passwordTv.setError("Password harus diisi!");
                return;
            }

            SharedPreferences preferences = this.getSharedPreferences("user_pref", MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("username", username);
            editor.putString("password", password);
            editor.apply();

            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

    }
}