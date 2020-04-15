package com.example.blockcertify_admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void RegisteredPartners(View v){
        Intent intent = new Intent(this, RegisteredPartners.class);
        startActivity(intent);
    }
    public void RegisteredUsers(View v){
        Intent intent = new Intent(this, RegisteredUsers.class);
        startActivity(intent);
    }
    public void RegisterManufactur(View v){
        Intent intent = new Intent(this, RegisterManufacture.class);
        startActivity(intent);
    }
}
