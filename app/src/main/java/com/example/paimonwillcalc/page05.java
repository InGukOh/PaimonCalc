package com.example.paimonwillcalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class page05 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page05);

        TextView resArea = findViewById(R.id.res);
        Intent resShow = getIntent();
        int resToView = resShow.getIntExtra("pg4res",0);
        /*Toast.makeText(getApplicationContext(), "결과 : " + resToView, Toast.LENGTH_SHORT).show();*/
        resArea.setText(String.valueOf(resToView));

        Intent intent = new Intent(this, page01.class);
        Button start = (Button) findViewById(R.id.toPage01);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "고마워 여행자!>▽<", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
