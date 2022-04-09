package com.example.paimonwillcalc;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.SettingInjectorService;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class page02 extends AppCompatActivity {
    public static Context page02Calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page02);

        Intent intent = new Intent(this,page03.class);
        Button start =(Button) findViewById(R.id.toPage03);

        EditText Gem = (EditText) findViewById(R.id.Gem);
        EditText Wish = (EditText) findViewById(R.id.Wish);
        EditText Gongwol = (EditText) findViewById(R.id.Gongwol);


        AlertDialog.Builder builder = new AlertDialog.Builder(page02.this);
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int nowWish = 0;
                int nowG = 0;


                if(Wish.getText().toString().length()!=0 && Gem.getText().toString().length()!=0){
                    nowWish = Integer.parseInt(Wish.getText().toString());
                    nowG = Integer.parseInt(Gem.getText().toString());
                    int pg2res = setMethod(nowG,nowWish);
                    Toast.makeText(getBaseContext(), "TEST"+nowG+" / "+nowWish +" / " + pg2res, Toast.LENGTH_SHORT).show();
                    intent.putExtra("pg2res",pg2res);
                    startActivity(intent);
                } else if(Gem.getText().toString().length() == 0 || Wish.getText().toString().length()== 0){
                    builder.setTitle("원석/인연이 하나도 없어!");
                    builder.setMessage("정말 원석/인연이 하나도 없니?");

                    builder.setPositiveButton("응, 없어", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int Y) {
                            int nowG = 0;
                            int nowWish = 0;
                            if(Gem.getText().toString().length() == 0){
                                nowG = 0;
                            } else if(Gem.getText().toString().length() != 0){
                                nowG = Integer.parseInt(Gem.getText().toString());
                            }
                            if(Wish.getText().toString().length()== 0){
                                nowWish = 0;
                            } else if (Wish.getText().toString().length() != 0){
                                nowWish = Integer.parseInt(Wish.getText().toString());
                            }
                            int pg2res = setMethod(nowG,nowWish);
                            /*Toast.makeText(getBaseContext(), "TEST"+nowG+" / "+nowWish +" / " + pg2res, Toast.LENGTH_SHORT).show();*/
                            intent.putExtra("pg2res",pg2res);
                            startActivity(intent);
                        }
                    });

                    builder.setNegativeButton("앗, 실수했어!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int N) {
                            Toast.makeText(getBaseContext(), "그러면 인연을 입력해줘", Toast.LENGTH_SHORT).show();
                        }
                    });
                    builder.create().show();
                }


            }
            public int setMethod(int nowG, int nowWish){
                int nowGong = 0;
               /* if(Gem.getText().toString().length()!=0){
                    nowG = Integer.parseInt(Gem.getText().toString());
                } else if(Gem.getText().toString().length()==0){
                    nowG = 0;
                }*/
                if(Gongwol.getText().toString().length()!=0){
                    nowGong = Integer.parseInt(Gongwol.getText().toString());
                } else if(Gongwol.getText().toString().length()==0){
                    nowGong = 0;
                }
                int methodRES = nowG+(nowWish *160)+(nowGong*150);
                /*Toast.makeText(getApplicationContext(),"1/ "+nowG+" 2/ "+nowWish+" 3/ "+nowGong+"RES//"+pg2res, Toast.LENGTH_LONG).show();*/
                return methodRES;
            }
        });

    }
}
