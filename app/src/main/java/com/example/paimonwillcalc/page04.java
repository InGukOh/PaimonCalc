package com.example.paimonwillcalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class page04 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page04);

        Intent intent = new Intent(this,page05.class);
        Button start =(Button) findViewById(R.id.toPage05);

        CheckBox G60 = (CheckBox)findViewById(R.id.G60);
        CheckBox G60N = (CheckBox)findViewById(R.id.G60N);
        CheckBox G300 = (CheckBox)findViewById(R.id.G300);
        CheckBox G300N = (CheckBox)findViewById(R.id.G300N);
        CheckBox G980 = (CheckBox)findViewById(R.id.G980);
        CheckBox G980N = (CheckBox)findViewById(R.id.G980N);
        CheckBox G1980 = (CheckBox)findViewById(R.id.G1980);
        CheckBox G1980N = (CheckBox)findViewById(R.id.G1980N);
        CheckBox G3280 = (CheckBox)findViewById(R.id.G3280);
        CheckBox G3280N = (CheckBox)findViewById(R.id.G3280N);
        CheckBox G6480 = (CheckBox)findViewById(R.id.G6480);
        CheckBox G6480N = (CheckBox)findViewById(R.id.G6480N);

        EditText G60Add = (EditText)findViewById(R.id.G60Add);
        EditText G300Add = (EditText)findViewById(R.id.G300Add);
        EditText G980Add = (EditText)findViewById(R.id.G980Add);
        EditText G1980Add = (EditText)findViewById(R.id.G1980Add);
        EditText G3280Add = (EditText)findViewById(R.id.G3280Add);
        EditText G6480Add = (EditText)findViewById(R.id.G6480Add);


        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent get_pg3res = getIntent();
                Intent get_MarketB = getIntent();
                int ready_pg4res = get_pg3res.getIntExtra("pg3res",0);
                String ready_MarketB = get_MarketB.getStringExtra("MarketB");

                if(G60.isChecked()){
                    ready_pg4res += 120;
                }
                if(G60N.isChecked()){
                    if(G60Add.getText().toString().length()!=0){
                        ready_pg4res += 60 * Integer.parseInt(G60Add.getText().toString());
                    } else {
                        ready_pg4res += 60;
                    }
                }
                if(G300.isChecked()){
                    ready_pg4res += 300;
                }
                if(G300N.isChecked()){
                    if(G300Add.getText().toString().length()!=0) {
                        ready_pg4res += (300 + 30) * Integer.parseInt(G300Add.getText().toString());
                    } else {
                        ready_pg4res += (300 + 30);
                    }
                }
                if(G980.isChecked()){
                    ready_pg4res += 1960;
                }
                if(G980N.isChecked()){
                    if(G980Add.getText().toString().length()!=0){
                        ready_pg4res += (980 + 110) * Integer.parseInt(G980Add.getText().toString());
                    } else {
                        ready_pg4res += (980 + 110);
                    }
                }
                if(G1980.isChecked()){
                    ready_pg4res += 3960;
                }
                if(G1980N.isChecked()){
                    if(G1980Add.getText().toString().length()!=0){
                        ready_pg4res += (1980 + 260) * Integer.parseInt(G1980Add.getText().toString());
                    } else {
                        ready_pg4res += (1980 + 260);
                    }
                }
                if(G3280.isChecked()){
                    ready_pg4res += 6560;
                }
                if(G3280N.isChecked()){
                    if(G3280Add.getText().toString().length()!=0){
                        ready_pg4res += (3280+600) * Integer.parseInt(G3280Add.getText().toString());
                    } else {
                        ready_pg4res += (3280+600);
                    }
                }
                if(G6480.isChecked()){
                    ready_pg4res +=12960;
                }
                if(G6480N.isChecked()){
                    if(G6480Add.getText().toString().length()!=0){
                        ready_pg4res += (6480+1600) * Integer.parseInt(G6480Add.getText().toString());
                    } else {
                        ready_pg4res += (6480+1600);
                    }
                }
                int FinRes = 0;
                int CalcInfo = (ready_pg4res / 160);
                int get_StarLight = ((CalcInfo / 10)*2)/5; // 구매 및 공월,기행으로 받은 원석을 인연으로 치환 후 매 10회 가챠마다 스타라이트를 2개받음
                                                            // 즉 100회가챠 -> 100 / 10 * 2 이므로 20개의 스타라이트를 가지게되고 이를 5로 나누면 스타라이트로 교환할 수 있는 인연량이 나옴

                /*if(StarLight >= 3){
                    int StarLight_Change = 0;
                    int StarLight_Stack = 0;
                        for (int i = 0; i <= StarLight/3; i++){
                            StarLight_Change++;
                            StarLight_Stack++;
                            if(StarLight_Stack % 5 == 0 ){
                                StarLight_Change += 2;
                            }
                        }
                        FinRes += StarLight_Change;
                }*/


                if(ready_MarketB.equals("yes")) FinRes +=5;
                if(ready_MarketB.equals("no")) FinRes +=0;

                FinRes = CalcInfo + get_StarLight;


                intent.putExtra("pg4res",FinRes);
                startActivity(intent);


            }
        });
    }
}
