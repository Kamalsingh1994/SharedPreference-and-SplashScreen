package com.example.cool.dental.data;

import android.app.Activity;
import android.content.SharedPreferences;
import android.widget.EditText;

import com.example.cool.dental.R;


public class Common {
    public static void setValue(Activity activity){
        SharedPreferences sharedPreferences=activity.getSharedPreferences("myPref",0);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        EditText editText=activity.findViewById(R.id.et_login);
        editor.putString("token", "admin");
        if(editText.getText().toString().equalsIgnoreCase("admin")) {
            editor.apply();
        }
    }
    public static String getValue(Activity activity){
        SharedPreferences sharedPreferences=activity.getSharedPreferences("myPref",0);
        String value=sharedPreferences.getString("token","");
        return value;
    }
    public static void delete(Activity activity){
        SharedPreferences sharedPreferences=activity.getSharedPreferences("myPref",0);
        sharedPreferences.edit().clear().apply();
    }
}
