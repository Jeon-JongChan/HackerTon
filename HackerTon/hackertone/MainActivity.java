package com.example.bjsing.hackerton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.bjsing.hackerton.R;

/**
 * Created by loki3 on 2017-12-19.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
    }
}