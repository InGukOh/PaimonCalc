package com.example.paimonwillcalc.util;

import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;
import java.util.ArrayList;

public class dataSetter extends AppCompatActivity {

    public String getFileData(){
        String json = "";
        try{
            InputStream is = getAssets().open("DATA.json");
            int fileSize = is.available();
            byte[] buffer = new byte[fileSize];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
        }catch (Exception e){
            e.printStackTrace();
        }
        return json;
    }

    public String Character_Res(String set){
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
}
