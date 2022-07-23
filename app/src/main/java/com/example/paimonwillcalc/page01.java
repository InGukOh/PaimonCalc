package com.example.paimonwillcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class page01 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page01);

        long now = System.currentTimeMillis();

        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("EE", Locale.KOREA);

        String weekDay = sdf.format(date);

        TextView whatDate = (TextView) findViewById(R.id.whatDate);

        TextView Cbook = (TextView) findViewById(R.id.Cbook);
        TextView Fweapon = (TextView) findViewById(R.id.Fweapon);

        Cbook.setOnClickListener(new View.OnClickListener() {
            AlertDialog.Builder builder = new AlertDialog.Builder(page01.this);
            @Override
            public void onClick(View view) {
                String CList = null;
                if(weekDay.equals("월")||weekDay.equals("목")){
                    CList = "몬드 : \n엠버, 클레, 바바라, 타르탈리아, 설탕, 디오나, 에일로이\n" +
                            "리월 : \n각청, 치치, 응광, 소, 신학, 야란\n" +
                            "이나즈마 : \n요이미야, 코코미, 토마";
                } else if(weekDay.equals("화")||weekDay.equals("금")) {
                    CList = "몬드 : \n베넷, 다이루크, 모나, 진, 레이저, 노엘, 유라\n" +
                            "리월 : \n중운, 향릉, 감우, 호두, 카에데하라 카즈하, 운근\n" +
                            "이나즈마 : \n아야카, 사라, 이토, 아야토, 시노부";
                } else if(weekDay.equals("수")||weekDay.equals("토")){
                    CList = "몬드 : \n벤티, 리사, 피슬, 케이아, 알베도, 로자리아\n" +
                            "리월 : \n신염, 행추, 북두, 종려, 연비\n" +
                            "이나즈마 : \n사유, 라이덴 쇼군, 고로, 야에 미코";
                } else {
                    CList = "오늘은 모든 캐릭터들이 사용할 수 있어!";
                }
                builder.setTitle("이 캐릭터들이 사용해!");
                builder.setMessage(CList);
                builder.setNeutralButton("알겠어!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        Fweapon.setOnClickListener(new View.OnClickListener() {
            AlertDialog.Builder builder = new AlertDialog.Builder(page01.this);
            @Override
            public void onClick(View view) {
                String WList = null;
                if(weekDay.equals("월")||weekDay.equals("목")){
                    WList = "한손검 : \n5성 - 매의 검/참봉의 칼날/안개를 가르는 회광/\n" +
                            "4성 - 페보니우스 검/왕실의 장검/뒷골목의 섬광/진사의 방추/용의 포효/흑암 장검/아메노마 카게우치가타나/\n\n" +
                            "양손검 : \n5성 - 송뢰가 울릴 무렵/\n" +
                            "4성 - 시간의 검/설장의 성은/백영검/아쿠오마루/\n\n" +
                            "법구 : \n5성 - 불멸의 달빛/\n" +
                            "4성 - 왕실의 비전록/페보니우스 비전/일월의 정수/흑암 홍옥/하쿠신의 고리/맹세의 눈동자/\n\n" +
                            "장병기 : \n5성 - 화박연/\n" +
                            "4성 - 유월창\n\n" +
                            "활 : \n5성 - /" +
                            "4성 - 청록의 사냥활/절현/유야의 왈츠/녹슨 활/흑암 배틀 보우";
                } else if(weekDay.equals("화")||weekDay.equals("금")) {
                    WList = "한손검 : \n5성 - 천공의 검/하란 월백의 후츠/\n" +
                            "4성 - 피리검/칠흑검/강림의 검/참암 프로토타입/\n\n" +
                            "양손검 : \n5성 - 천공의 긍지/무공의 검/쇄석의 붉은 뿔/\n" +
                            "4성 - 제례 대검/흑암참도/빗물 베기/카츠라기를 벤 나가마사/\n\n" +
                            "법구 : \n5성 - 천공의 두루마리/\n" +
                            "4성 - 음유시인의 악장/뒷골목의 술과 시/도도코 이야기집/황금 호박 프로토타입/소심/\n\n" +
                            "장병기 : \n5성 - /\n" +
                            "4성 - 결투의 창/용의 척추/흑암창/용학살창/왕실의 장창/\n\n" +
                            "활 : \n5성 - 종말 탄식의 노래/천공의 날개/비뢰의 고동/\n" +
                            "4성 - 제례활/담월 프로토타입/파마궁/포식자/모운의 달/";
                } else if(weekDay.equals("수")||weekDay.equals("토")){
                    WList = "한손검 : \n5성 - 오래된 자유의 서약/\n" +
                            "4성 - 제례검/부식의 검/강철 벌침/\n\n" +
                            "양손검 : \n5성 - 늑대의 말로/\n" +
                            "4성 - 페보니우스 대검/왕실의 대검/이무기 검/고화 프로토타입/\n\n" +
                            "법구 : \n5성 - 사풍 원서/속세의 자물쇠/\n" +
                            "4성 - 제례의 악장/인동의 열매/만국 항해용해도/\n\n" +
                            "장병기 : \n5성 - 천공의 마루/관홍의 창/호마의 지팡이/예초의 번개/\n" +
                            "4성 - 페보니우스 장창/별의 낫 프로토타입/키타인 십자창/「어획」/파도 베는 지느러미/\n\n" +
                            "활 : \n아모스의 활/극지의 별/\n" +
                            "4성 - 페보니우스 활/왕실의 장궁/바람 꽃의 노래/뒷골목 사냥꾼/강철궁/";
                } else {
                    WList = "오늘은 모든 캐릭터들이 사용할 수 있어!";
                }
                builder.setTitle("이 무기들에 필요해!");
                builder.setMessage(WList);
                builder.setNeutralButton("알겠어!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
        if(weekDay.equals("월")){
            whatDate.setTextColor(0xAAfdc308);
        } else if(weekDay.equals("화")){
            whatDate.setTextColor(0xAAffff00);
        } else if(weekDay.equals("수")){
            whatDate.setTextColor(0xAA0ab357);
        } else if(weekDay.equals("목")){
            whatDate.setTextColor(0xAA0775c3);
        } else if(weekDay.equals("금")){
            whatDate.setTextColor(0xAA042463);
        } else if(weekDay.equals("토")){
            whatDate.setTextColor(0xAA00aaff);
        } else if(weekDay.equals("일")){
            whatDate.setTextColor(0xAAff0b0c);
        }
        whatDate.setText(weekDay);

        String FweaponCont = null;
        SpannableString spannableStringF = null;
        TextView Fweapon_C = null;
        if(weekDay.equals("월")||weekDay.equals("목")){
            Cbook.setText("「자유」/「번영」/\n「부세」");
            Fweapon.setText("고탑왕/고운한림/\n먼바다");

            Fweapon_C = (TextView) findViewById(R.id.Fweapon);
            FweaponCont = Fweapon_C.getText().toString();
            spannableStringF = new SpannableString(FweaponCont);
            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#507dc7")),0,3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#a256e1")),4,8, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#b46e2c")),10,13, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        } else if(weekDay.equals("화")||weekDay.equals("금")){
            Cbook.setText("「투쟁」/「근면」/\n「풍아」");
            Fweapon.setText("칼바람 울프/안개구름/\n나루카미");

            Fweapon_C = (TextView) findViewById(R.id.Fweapon);
            FweaponCont = Fweapon_C.getText().toString();
            spannableStringF = new SpannableString(FweaponCont);
            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#507dc7")),0,6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#a256e1")),7,11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#b46e2c")),13,17, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);


        } else if(weekDay.equals("수")||weekDay.equals("토")){
            Cbook.setText("「시문」/「황금」/\n「천광」");
            Fweapon.setText("라이언 투사/흑운철/\n금석극화");

            Fweapon_C = (TextView) findViewById(R.id.Fweapon);
            FweaponCont = Fweapon_C.getText().toString();
            spannableStringF = new SpannableString(FweaponCont);
            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#507dc7")),0,6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#a256e1")),7,10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#b46e2c")),12,16, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        } else {
            Cbook.setText("전체");
            Fweapon.setText("전체");
            Fweapon_C = (TextView) findViewById(R.id.Fweapon);
            FweaponCont = Fweapon_C.getText().toString();
            spannableStringF = new SpannableString(FweaponCont);
            spannableStringF.setSpan(new ForegroundColorSpan(Color.parseColor("#ff5500")),0,2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }



        TextView Cbook_C = (TextView) findViewById(R.id.Cbook);
        String CbookCont = Cbook_C.getText().toString();;
        SpannableString spannableStringC = null;
        if(CbookCont.equals("전체")){
            spannableStringC = new SpannableString(CbookCont);
           /* Toast.makeText(getApplicationContext(),"같음"+CbookCont, Toast.LENGTH_SHORT).show();*/
            spannableStringC.setSpan(new ForegroundColorSpan(Color.parseColor("#ff5500")),0,2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        } else if(!CbookCont.equals("전체")){
            spannableStringC = new SpannableString(CbookCont);
            spannableStringC.setSpan(new ForegroundColorSpan(Color.parseColor("#299072")),0,3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableStringC.setSpan(new ForegroundColorSpan(Color.parseColor("#507dc7")),5,9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableStringC.setSpan(new ForegroundColorSpan(Color.parseColor("#a256e1")),10,14, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                   }

        Cbook_C.setText(spannableStringC);
        Fweapon_C.setText(spannableStringF);


        Intent intent = new Intent(this,page02.class);
        Button start =(Button) findViewById(R.id.toPage02);
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(),"시작하자!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
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