package com.example.road_safety_pedistrian_pfe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Pedistrain;
    private TextView UserType;
    private TextView Welcome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pedistrain = findViewById(R.id.button);
        Welcome = findViewById(R.id.Welcome);
        UserType = findViewById(R.id.UserType);
        Pedistrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginActivity_Intent();
            }
        });
    }
    public void LoginActivity_Intent() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}