package com.reckordp.penyambutpagi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public String GITHUB_PROFILE = "https://github.com/Reckordp";

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
        pembuat.setNegativeButton(R.string.lebih_lanjut,
                (dialog, which) -> startActivity(
                        new Intent(Intent.ACTION_VIEW, Uri.parse(GITHUB_PROFILE))
                ));
        pembuat.show();
    }
}