package com.example.paimonwillcalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class page03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page03);

        Intent intent = new Intent(this,page04.class);

        Button start =(Button) findViewById(R.id.toPage04);

        RadioButton buyGihang = (RadioButton) findViewById(R.id.buyGihang);
        RadioButton notbuyGihang = (RadioButton) findViewById(R.id.notbuyGihang);
        RadioButton yesMarket = (RadioButton) findViewById(R.id.yesMarket);
        RadioButton noMarket = (RadioButton) findViewById(R.id.noMaket);

        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent get_pg2res = getIntent();
                int ready_pg3res = get_pg2res.getIntExtra("pg2res",0);

                int GihangP = 0;
                String MarketB = "";
                int pg3res = ready_pg3res;

                if(buyGihang.isChecked()){
                    GihangP = 1480;
                } else if(!buyGihang.isChecked() || !notbuyGihang.isChecked() ||notbuyGihang.isChecked()){
                    GihangP = 0;
                }

                pg3res += GihangP;

                if(yesMarket.isChecked()){
                    MarketB = "yes";
                } else if(!yesMarket.isChecked() || !noMarket.isChecked() || noMarket.isChecked()) {
                    MarketB = "no";
                }
                intent.putExtra("pg3res",pg3res);
                intent.putExtra("MarketB",MarketB);
                /*Toast.makeText(getApplicationContext(),"계산" + pg3res+"마켓"+MarketB, Toast.LENGTH_SHORT).show();*/
                startActivity(intent);
            }
        });
    }
}
