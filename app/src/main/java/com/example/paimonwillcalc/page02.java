package com.example.paimonwillcalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class page02 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page02);

        Intent intent = new Intent(this,page03.class);
        Button start =(Button) findViewById(R.id.toPage03);

        EditText Gem = (EditText) findViewById(R.id.Gem);
        EditText Wish = (EditText) findViewById(R.id.Wish);
        EditText Gongwol = (EditText) findViewById(R.id.Gongwol);

        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int nowG = 0;
                int nowWish = 0;
                int nowGong = 0;


                if(Gem.getText().toString().length()!=0){
                    nowG = Integer.parseInt(Gem.getText().toString());
                } else if(Gem.getText().toString().length()==0){
                    nowG = 0;
                }
                if(Wish.getText().toString().length()!=0){
                    nowWish = Integer.parseInt(Wish.getText().toString());
                } else if(Wish.getText().toString().length()==0){
                    nowWish = 0;
                }
                if(Gongwol.getText().toString().length()!=0){
                    nowGong = Integer.parseInt(Gongwol.getText().toString());
                } else if(Gongwol.getText().toString().length()==0){
                    nowGong = 0;
                }
                int pg2res = nowG+(nowWish*160)+(nowGong*150);
                /*Toast.makeText(getApplicationContext(),"1/ "+nowG+" 2/ "+nowWish+" 3/ "+nowGong+"RES//"+pg2res, Toast.LENGTH_LONG).show();*/
                intent.putExtra("pg2res",pg2res);
                startActivity(intent);
            }
        });
    }
}
