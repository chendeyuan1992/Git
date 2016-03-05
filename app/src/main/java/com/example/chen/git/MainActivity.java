package com.example.chen.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 *注解1111111111
 */
public class MainActivity extends AppCompatActivity {

    /**
     * 天机
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.print(false);
    }
}
