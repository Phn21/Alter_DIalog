package com.example.day3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);

        ab.setTitle("Hello");
        ab.setMessage("Hello, choose the decision");
        ab.setIcon(android.R.drawable.star_on);


//        ab.setPositiveButton("Yes", null);
        ab.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Pressed Yes", Toast.LENGTH_SHORT).show();
            }
        });

        ab.setNegativeButton("no", null);

        ab.setNeutralButton("Cancel",null);



        ab.show();

    }
}