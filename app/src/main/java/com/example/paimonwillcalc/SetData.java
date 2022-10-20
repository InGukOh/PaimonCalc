package com.example.paimonwillcalc;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class SetData extends AppCompatActivity {


    public ArrayList Character(String set,String json){
        ArrayList Characters_Arr = new ArrayList();

        try{
            JSONObject jsonObject = new JSONObject(json);
            String Sets = jsonObject.getString(set);
            JSONObject SetObj = new JSONObject(Sets);
            String Characters_JSON = SetObj.getString("Char");
            JSONObject Characters_JSON_Obj = new JSONObject(Characters_JSON);
            Characters_Arr = Characters(Characters_JSON_Obj);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Characters_Arr ;
    }

    public ArrayList Weapon(String set,String json){
        ArrayList Weapons_Arr = new ArrayList();

        try{
            JSONObject jsonObject = new JSONObject(json);
            String Sets = jsonObject.getString(set);
            JSONObject SetObj = new JSONObject(Sets);
            String Weapons_JSON = SetObj.getString("Weapon");
            JSONObject Weapons_JSON_Obj = new JSONObject(Weapons_JSON);
            Weapons_Arr = Weapons(Weapons_JSON_Obj);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Weapons_Arr;
    }


    public ArrayList Characters(JSONObject Characters_JSON_Obj){
        ArrayList Character_List = new ArrayList();
        try{

            Iterator C = Characters_JSON_Obj.keys();
            while (C.hasNext()){
                String toCharL = Characters_JSON_Obj.getString(C.next().toString());
                Character_List.add(toCharL);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return Character_List;
    }

    public ArrayList Weapons(JSONObject Weapons_JSON_Obj) {
        ArrayList Weapon_List = new ArrayList();
        try{
            Iterator C = Weapons_JSON_Obj.keys();
            while (C.hasNext()){
                String category = Weapons_JSON_Obj.getString(C.next().toString());
                JSONObject WeaponName = new JSONObject(category);
                String star_5 = WeaponName.getString("5성");
                String star_4 = WeaponName.getString("4성");
                Weapon_List.add(star_5);
                Weapon_List.add(star_4);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return Weapon_List;
    }


}
