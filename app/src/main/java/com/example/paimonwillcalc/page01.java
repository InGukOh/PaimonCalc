package com.example.paimonwillcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class page01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page01);

        Intent intent = new Intent(this,page02.class);
        Button start =(Button) findViewById(R.id.toPage02);
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"시작하자!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}