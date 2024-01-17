package com.example.sharedpreferences_use;

import android.content.Context;
import android.content.SharedPreferences;

public class Shpf {
    //設定變數
    private static String Name="Name";
    private SharedPreferences shpf;
    private Context context;

    public  Shpf(Context context){
        this.context=context;
        //設定SharedPreferences的模式。設定為只有自己(app_name)才可以讀寫。
        shpf = this.context.getSharedPreferences(String.valueOf(R.string.app_name) , Context.MODE_PRIVATE);
    }
    //放入名子的方法，前面的"Name"為Key。
    public void setName(String name){
        shpf.edit().putString(Name,name).apply();
    }
    //拿取名子的方法，前面的"Name"為Key。
    public String getName(){
        return shpf.getString(Name,"");
    }
}