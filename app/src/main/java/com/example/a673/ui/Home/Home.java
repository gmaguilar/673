package com.example.a673.ui.Home;

import android.content.Intent;
import android.media.Image;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a673.R;
import com.example.a673.ui.Login.Login;
import com.example.a673.ui.SignIn.SignIn;

public class Home extends AppCompatActivity {

    Button bLogin, bRegister;
    Image iLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bLogin = findViewById(R.id.bLogin);
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLogin = new Intent(Home.this, Login.class);
                startActivity(intentLogin);
            }
        });

        bRegister = findViewById(R.id.bRegister);
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegister = new Intent(Home.this, SignIn.class);
                startActivity(intentRegister);
            }
        });

    }
}