package com.example.paimonwillcalc;

import android.os.Bundle;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

import androidx.appcompat.app.AppCompatActivity;

import com.example.paimonwillcalc.util.DataSetter;

import java.io.InputStream;
import java.util.ArrayList;


public class todayWeapons extends AppCompatActivity {

    ImageView itemView = null;
    ImageView weapon5StarView = null;
    ImageView weapon4StarView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.today_weapons);


        LinearLayout showItem = findViewById(R.id.showItem);
        LinearLayout show5StarWeapon = findViewById(R.id.show5StartWeapon);
        LinearLayout show4StarWeapon = findViewById(R.id.show4StartWeapon);

        ArrayList<ArrayList> imgData = getFileData();

        for(int i = 0; i<imgData.get(2).size(); i++){

            itemView = new ImageView(this);

            int id = this.getResources().getIdentifier(
                    "img_it_wp_"+(imgData.get(2).get(i)),
                    "drawable",
                    this.getPackageName());

            itemView.setImageResource(id);

            showItem.addView(itemView);

        }

        show5StarWeapon.addView(imgTable(weapon5StarView,imgData,0));
        show4StarWeapon.addView(imgTable(weapon4StarView,imgData,1));
    }




    public ArrayList<ArrayList> getFileData(){

        ArrayList<ArrayList> returnData = new ArrayList<>();

        String json = "";

        try{
            InputStream is = getAssets().open("Weapon_Material.json");
            int fileSize = is.available();
            byte[] buffer = new byte[fileSize];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");

            DataSetter dataSetter = new DataSetter();
            ArrayList<ArrayList> imgData = dataSetter.getData(json);

            returnData = imgData;

        }catch (Exception e){
            e.printStackTrace();
        }
        return returnData;
    }


    public TableRow.LayoutParams defaultTdParam(){

        TableRow.LayoutParams params = (TableRow.LayoutParams) new TableRow.LayoutParams(200,200);

        params.setMargins(12,12,12,12);

        return params;
    }

    public TableLayout imgTable(ImageView imageView, ArrayList<ArrayList> imgData, int arrIdx){

        TableLayout imgTable = new TableLayout(this);

        int imgIdx= 0;

        TableRow imgRow[]=new TableRow[imgData.get(arrIdx).size()/4+1];

        for(int tr =0; tr<imgData.get(arrIdx).size()/4+1; tr++){
            imgRow[tr] = new TableRow(this);
            int idxCheck = imgIdx+4;
            if(idxCheck > imgData.get(arrIdx).size()){
                idxCheck = imgData.get(arrIdx).size();
            }

            for(int td = imgIdx ; td < idxCheck; td++){
                imageView = new ImageView(this);

                int id = this.getResources().getIdentifier(
                        "img_wp_"+imgData.get(arrIdx).get(td),
                        "drawable",
                        this.getPackageName());

                imageView.setImageResource(id);

                imageView.setBackgroundResource(
                        this.getResources().getIdentifier(
                                "asset_todayinfo_img_edge",
                                "drawable",
                                this.getPackageName()));

                TableRow.LayoutParams params = defaultTdParam();

                imgRow[tr].addView(imageView,params);

            }
            imgIdx+=5;

            imgTable.addView(imgRow[tr]);

        }
        return imgTable;
    }


}