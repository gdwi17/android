package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView hasil;
    Button hitung, reset;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hitung=(Button) findViewById(R.id.btnHitung);
        reset=(Button) findViewById(R.id.btnReset);
        hasil=(TextView) findViewById(R.id.txtHasil);

        hasil.setText(""+counter);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                hasil.setText(""+counter);
                if(counter>=30){
                    hasil.setText(""+counter);
                    Toast.makeText(getApplicationContext(),"sudah maksimal30", Toast.LENGTH_LONG).show();
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=0;
                hasil.setText(""+counter);
            }
        });
    }
}
