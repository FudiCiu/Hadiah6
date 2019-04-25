package com.latihanandroid.hadiah6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        hasil=(TextView) findViewById(R.id.tvHasil);
        hasil.setText(String.valueOf(getIntent().getDoubleExtra("Hasil",0)));
    }
}
