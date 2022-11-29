package com.example.paimonwillcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.paimonwillcalc.util.SetDay;


public class page01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.page01);

        String weekDay = SetDay.getToday();

        TextView whatDate = findViewById(R.id.whatDate);

        if(weekDay.equals("월")){
            whatDate.setTextColor(0xAAfdc308);
        } else if(weekDay.equals("화")){
            whatDate.setTextColor(0xAAffff00);
        } else if(weekDay.equals("수")){
            whatDate.setTextColor(0xAA0ab357);
        } else if(weekDay.equals("목")){
            whatDate.setTextColor(0xAA0775c3);
        } else if(weekDay.equals("금")){
            whatDate.setTextColor(0xAA86c5e5);
        } else if(weekDay.equals("토")){
            whatDate.setTextColor(0xAA00aaff);
        } else if(weekDay.equals("일")){
            whatDate.setTextColor(0xAAff0b0c);
        }
        whatDate.setText(weekDay);


        findViewById(R.id.CharacterInfo).setOnClickListener(allClick);

        findViewById(R.id.WeaponInfo).setOnClickListener(allClick);

        findViewById(R.id.toPage02).setOnClickListener(allClick);
    }

    View.OnClickListener allClick = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            switch (view.getId()){
                case R.id.CharacterInfo:
                    Intent todayCharacters = new Intent(page01.this, todayCharacters.class);
                    Toast.makeText(getApplicationContext(),"오늘의 캐릭터들이야!", Toast.LENGTH_SHORT).show();
                    startActivity(todayCharacters);
                    break;

                case R.id.WeaponInfo:
                    Intent todayWeapons = new Intent(page01.this, todayWeapons.class);
                    Toast.makeText(getApplicationContext(),"오늘의 무기들이야!", Toast.LENGTH_SHORT).show();
                    startActivity(todayWeapons);
                    break;

                case R.id.toPage02:
                    Intent nextPage = new Intent(page01.this, page02.class);
                    Toast.makeText(getApplicationContext(),"시작하자!", Toast.LENGTH_SHORT).show();
                    startActivity(nextPage);
                    break;
            }

        }
    };

    private long backKeyPressedTime = 0;
    private Toast toast;


    @Override
    public void onBackPressed(){

        Intent cycle = getIntent();
        int check = cycle.getIntExtra("cycle",0);
        if (System.currentTimeMillis() > backKeyPressedTime + 2500) {
            backKeyPressedTime = System.currentTimeMillis();
            if(check == 0){
                toast = Toast.makeText(this,"아직 아무것도 계산하지 않았어!", Toast.LENGTH_SHORT);
                toast.show();
            } else if(check == 1){
                toast = Toast.makeText(this,"앗..배고파서 까먹어버렸어!", Toast.LENGTH_SHORT);
                toast.show();
            }
            toast = Toast.makeText(this, "뒤로 가기 버튼을 한번 더 누르면" + "\n"+
                    "앱이 종료되.", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        if (System.currentTimeMillis() <= backKeyPressedTime + 2500) {
            finish();
            toast.cancel();
            toast = Toast.makeText(this,"바이바이~!",Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}