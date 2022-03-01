package com.reckordp.penyambutpagi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        AlertDialog.Builder pembuat = new AlertDialog.Builder(this);
        pembuat.setMessage(R.string.message);
        pembuat.setTitle(R.string.title_message);
        pembuat.setPositiveButton(android.R.string.ok, (dialog, which) -> {});
        pembuat.setNegativeButton(R.string.lebih_lanjut, (dialog, which) -> {});
        pembuat.show();
    }
}