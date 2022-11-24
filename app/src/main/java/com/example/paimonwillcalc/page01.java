package com.example.paimonwillcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.paimonwillcalc.util.SetDay;


public class page01 extends AppCompatActivity {
//   public String getFileData(){
//        String json = "";
//        try{
//            InputStream is = getAssets().open("DATA.json");
//            int fileSize = is.available();
//            byte[] buffer = new byte[fileSize];
//            is.read(buffer);
//            is.close();
//
//            json = new String(buffer, "UTF-8");
//
//            System.out.println(json);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return json;
//    }

    /* public String Character_Res(String set){
        String Characters = null;

        SetData setData = new SetData();
        String json = getFileData();

        ArrayList Arr_Character = new ArrayList();
        Arr_Character = setData.Character(set,json);

        return Characters = "몬드 : " + Arr_Character.get(0).toString() + "\n"+
                "리월 : " + Arr_Character.get(1).toString() + "\n"+
                "이나즈마 : " + Arr_Character.get(2).toString();
    }

    public String Weapon_Res(String set){
        String Weapons = null;

        SetData setData = new SetData();
        String json = getFileData();

        ArrayList Arr_Weapon = new ArrayList();
        Arr_Weapon = setData.Weapon(set,json);

        return Weapons = "한손검 : " + Arr_Weapon.get(0).toString() +"\n"+
                         "4성 - " +Arr_Weapon.get(1).toString() +"\n"+
                         "양손검 :" +Arr_Weapon.get(2).toString() +"\n"+
                         "4성 - " +Arr_Weapon.get(3).toString() +"\n"+
                         "법구 : " +Arr_Weapon.get(4).toString() +"\n"+
                         "4성 - " +Arr_Weapon.get(5).toString() +"\n"+
                         "장병기 : " +Arr_Weapon.get(6).toString() +"\n"+
                         "4성 - " +Arr_Weapon.get(7).toString() +"\n"+
                         "활 : " +Arr_Weapon.get(8).toString() +"\n"+
                         "4성 - "+Arr_Weapon.get(9).toString() +"\n";
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page01);

//        Cbook.setOnClickListener(new View.OnClickListener() {
//            AlertDialog.Builder builder = new AlertDialog.Builder(page01.this);
//
//            @Override
//            public void onClick(View view) {
//                String Characters_res;
//                if(weekDay.equals("월")||weekDay.equals("목")){
//
//                    Characters_res = Character_Res("Set_01");
//                } else if(weekDay.equals("화")||weekDay.equals("금")) {
//
//                    Characters_res = Character_Res("Set_02");
//                } else if(weekDay.equals("수")||weekDay.equals("토")){
//
//                    Characters_res = Character_Res("Set_03");
//                } else {
//                    Characters_res = "오늘은 모든 캐릭터들이 사용할 수 있어!";
//                }
//
//                builder.setTitle("이 캐릭터들이 사용해!");
//                builder.setMessage(Characters_res);
//                builder.setNeutralButton("알겠어!", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int id) {
//                    }
//                });
//                AlertDialog alertDialog = builder.create();
//                alertDialog.show();
//            }
//        });
//
//        Fweapon.setOnClickListener(new View.OnClickListener() {
//            AlertDialog.Builder builder = new AlertDialog.Builder(page01.this);
//            @Override
//            public void onClick(View view) {
//                String Weapon_res;
//                if(weekDay.equals("월")||weekDay.equals("목")){
//                    Weapon_res = Weapon_Res("Set_01");
//
//                } else if(weekDay.equals("화")||weekDay.equals("금")) {
//                    Weapon_res = Weapon_Res("Set_02");
//                } else if(weekDay.equals("수")||weekDay.equals("토")){
//                    Weapon_res = Weapon_Res("Set_03");
//                } else {
//                    Weapon_res = "오늘은 모든 캐릭터들이 사용할 수 있어!";
//                }
//                builder.setTitle("이 무기들에 필요해!");
//                builder.setMessage(Weapon_res);
//                builder.setNeutralButton("알겠어!", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int id) {
//                    }
//                });
//                AlertDialog alertDialog = builder.create();
//                alertDialog.show();
//            }
//        });
//        if(weekDay.equals("월")){
//            whatDate.setTextColor(0xAAfdc308);
//        } else if(weekDay.equals("화")){
//            whatDate.setTextColor(0xAAffff00);
//        } else if(weekDay.equals("수")){
//            whatDate.setTextColor(0xAA0ab357);
//        } else if(weekDay.equals("목")){
//            whatDate.setTextColor(0xAA0775c3);
//        } else if(weekDay.equals("금")){
//            whatDate.setTextColor(0xAA042463);
//        } else if(weekDay.equals("토")){
//            whatDate.setTextColor(0xAA00aaff);
//        } else if(weekDay.equals("일")){
//            whatDate.setTextColor(0xAAff0b0c);
//        }
//        whatDate.setText(weekDay);
//
//        String FweaponCont = null;
//        SpannableString spannableStringF = null;
//        TextView Fweapon_C = null;
//        if(weekDay.equals("월")||weekDay.equals("목")){
//            Cbook.setText("「자유」/「번영」/\n「부세」");
//            Fweapon.setText("고탑왕/고운한림/\n먼바다");
//
//            Fweapon_C = (TextView) findViewById(R.id.Fweapon);
//            FweaponCont = Fweapon_C.getText().toString();
//            spannableStringF = new SpannableString(FweaponCont);
//            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#507dc7")),0,3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#a256e1")),4,8, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#b46e2c")),10,13, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//        } else if(weekDay.equals("화")||weekDay.equals("금")){
//            Cbook.setText("「투쟁」/「근면」/\n「풍아」");
//            Fweapon.setText("칼바람 울프/안개구름/\n나루카미");
//
//            Fweapon_C = (TextView) findViewById(R.id.Fweapon);
//            FweaponCont = Fweapon_C.getText().toString();
//            spannableStringF = new SpannableString(FweaponCont);
//            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#507dc7")),0,6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#a256e1")),7,11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#b46e2c")),13,17, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//
//        } else if(weekDay.equals("수")||weekDay.equals("토")){
//            Cbook.setText("「시문」/「황금」/\n「천광」");
//            Fweapon.setText("라이언 투사/흑운철/\n금석극화");
//
//            Fweapon_C = (TextView) findViewById(R.id.Fweapon);
//            FweaponCont = Fweapon_C.getText().toString();
//            spannableStringF = new SpannableString(FweaponCont);
//            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#507dc7")),0,6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#a256e1")),7,10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#b46e2c")),12,16, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//        } else {
//            Cbook.setText("전체");
//            Fweapon.setText("전체");
//            Fweapon_C = (TextView) findViewById(R.id.Fweapon);
//            FweaponCont = Fweapon_C.getText().toString();
//            spannableStringF = new SpannableString(FweaponCont);
//            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#ff5500")),0,2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        }
//
//
//
//        TextView Cbook_C = (TextView) findViewById(R.id.Cbook);
//        String CbookCont = Cbook_C.getText().toString();;
//        SpannableString spannableStringC = null;
//        if(CbookCont.equals("전체")){
//            spannableStringC = new SpannableString(CbookCont);
//           /* Toast.makeText(getApplicationContext(),"같음"+CbookCont, Toast.LENGTH_SHORT).show();*/
//            spannableStringC.setSpan(new ForegroundColorSpan(Color.parseColor("#ff5500")),0,2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        } else if(!CbookCont.equals("전체")){
//            spannableStringC = new SpannableString(CbookCont);
//            spannableStringC.setSpan(new ForegroundColorSpan(Color.parseColor("#299072")),0,3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            spannableStringC.setSpan(new ForegroundColorSpan(Color.parseColor("#507dc7")),5,9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            spannableStringC.setSpan(new ForegroundColorSpan(Color.parseColor("#a256e1")),10,14, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//                   }
//
//        Cbook_C.setText(spannableStringC);
//        Fweapon_C.setText(spannableStringF);

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
                    "앱이 종료되.", Toast.LENGTH_LONG);
            toast.show();
            return;
        }
        if (System.currentTimeMillis() <= backKeyPressedTime + 2500) {
            finish();
            toast.cancel();
            toast = Toast.makeText(this,"바이바이~!",Toast.LENGTH_LONG);
            toast.show();
        }

    }
}