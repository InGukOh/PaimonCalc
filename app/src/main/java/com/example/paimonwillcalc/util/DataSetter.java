package com.example.paimonwillcalc.util;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class DataSetter extends AppCompatActivity {

    private String getDay = SetDay.getToday();



    public String Set_01 (){
        String result = this.getDay.equals("월")? "Set_01" : this.getDay.equals("목") ? "Set_01" : null;
        return result;
    }

    public String Set_02 (){
        String result = this.getDay.equals("화")? "Set_02" : this.getDay.equals("금")? "Set_02" : null;
        return result;
    }

    public String Set_03 (){
        String result = this.getDay.equals("수")? "Set_03" : this.getDay.equals("토")? "Set_03" : null;
        return result;
    }



    public ArrayList getData(String json){
        ArrayList<ArrayList> imgData = new ArrayList<>();
        if(Set_01() != null){
            imgData =JsonParse(Set_01(),json);
        }
        if(Set_02() != null){
            imgData =JsonParse(Set_02(),json);
        }
        if(Set_03() != null){
            imgData = JsonParse(Set_03(),json);
        }
        return  imgData;
    }



    public ArrayList JsonParse(String set, String json){
        try {
            JSONObject setObject = new JSONObject(json);

            JSONArray setArr = setObject.getJSONArray(set);

            ArrayList<String> test1 = splitData(setArr.getJSONArray(0));
            ArrayList<String> test2 = splitData(setArr.getJSONArray(1));
            ArrayList<String> test3 = splitData(setArr.getJSONArray(2));

            ArrayList<ArrayList<String>> masterArr = new ArrayList<>();

            masterArr.add(test1);
            masterArr.add(test2);
            masterArr.add(test3);

            return masterArr;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }



    public ArrayList splitData(JSONArray jsonArray) throws JSONException {
        ArrayList<String> dataList = new ArrayList<>();
        for(int i = 0; i<jsonArray.length(); i++){
            dataList.add(jsonArray.getString(i));
        }
        return dataList;
    }
}
