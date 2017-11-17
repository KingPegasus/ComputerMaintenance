package com.example.android.computermaintenance;


import android.Manifest;
import android.app.DownloadManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class NewMainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);

    }



    /** Called when the user taps the Register button */
    public void registerUser(View view) {
        // Do something in response to button
        // Main Activity is handling Registration Process

        Intent intent = new Intent(this, RegisterActivity.class);

        startActivity(intent);
    }

    /** Called when the user taps the Signin button */
    public void signIn(View view) {
        // Do something in response to button
        // SignInActivity is handling SignIn Process

        Intent intent = new Intent(this, SignInActivity.class);

        startActivity(intent);
    }
}
