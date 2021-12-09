package com.example.clu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View v)
    {
        EditText user=(EditText)findViewById(R.id.username);
        String uname=user.getText().toString();
        EditText pass=(EditText) findViewById(R.id.password);
        String passt=pass.getText().toString();
        System.out.println("Button Pressed "+uname+" "+passt);
        if(uname.equals("admin") && passt.equals("admin"))
        {
            System.out.println("Access Granted");
//            Snackbar mySnackbar = Snackbar.make(v, "ACCESS GRANTED", Snackbar.LENGTH_SHORT);
//            mySnackbar.show();
            Toast.makeText(MainActivity.this, "Access granted", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, actAccount.class);
            // start the activity connect to the specified class
            startActivity(intent);
        }
    }
}