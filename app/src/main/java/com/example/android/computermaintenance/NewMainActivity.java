package com.example.android.computermaintenance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class NewMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);
    }

    /** Called when the user taps the Register button */
    public void registerUser(View view) {
        // Do something in response to button
        // Main Activity is handling Registration Process

        Intent intent = new Intent(this, MainActivity.class);

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
