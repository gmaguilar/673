package com.example.a673.ui.Login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a673.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getIntent();
    }
}