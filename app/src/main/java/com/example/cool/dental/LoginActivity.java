package com.example.cool.dental;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cool.dental.data.Common;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //EditText et_login, et_pass;
        TextView tv_login;
        //et_login = findViewById(R.id.et_login);
        //et_pass = findViewById(R.id.et_pass);
        tv_login= findViewById(R.id.tv_login);

        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Common.setValue(LoginActivity.this);
                String name=Common.getValue(LoginActivity.this);
                if (name.equalsIgnoreCase("admin")) {
                    //Log.d("value", Common.getValue(LoginActivity.this));
                    Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(LoginActivity.this,"Invalid Entry",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
