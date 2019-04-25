package com.latihanandroid.hadiah6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtBil1;
    EditText edtBil2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtBil1= (EditText) findViewById(R.id.bilangan1);
        edtBil2=(EditText) findViewById(R.id.bilangan2);
    }

    public void Jumlah(View view) {
        if (edtBil1.getText().toString().isEmpty()|| edtBil2.getText().toString().isEmpty()){
            return;
        }
        Double hasil= Double.parseDouble(edtBil1.getText().toString())+Double.parseDouble(edtBil2.getText().toString());
        Intent intent= new Intent(this,SecondActivity.class);
        intent.putExtra("Hasil",hasil);
        startActivity(intent);
    }

    public void Kurang(View view) {
        if (edtBil1.getText().toString().isEmpty()|| edtBil2.getText().toString().isEmpty()){
            return;
        }
        Double hasil= Double.parseDouble(edtBil1.getText().toString())-Double.parseDouble(edtBil2.getText().toString());
        Intent intent= new Intent(this,SecondActivity.class);
        intent.putExtra("Hasil",hasil);
        startActivity(intent);
    }
}
