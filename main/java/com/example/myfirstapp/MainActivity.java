package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signup(View view) {

        // Get Data from form
        EditText Main_Enter_Name = findViewById(R.id.Main_Enter_Name);
        EditText Main_Enter_Password = findViewById(R.id.Main_Enter_Password);

        // Put Data to System
        String name = Main_Enter_Name.getText().toString();
        String password = Main_Enter_Password.getText().toString();

        // Display Data In Format
        String DisplayData = "用户名 : " + name + ";密码为" + password;

        Intent intent = new Intent(this, Main2Activity.class);

        // Send through Intent system
        intent.putExtra("userInfo", DisplayData);

        startActivity(intent);
    }
}
