package com.android.mockito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jeroenmols.mockitoexample.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
