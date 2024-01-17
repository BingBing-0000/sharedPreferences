package com.example.sharedpreferences_use;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edittext_password;
    private EditText edittext_username;
    private Button Login_Button;
    private CheckBox keepword_checkbox;
    private Shpf shpf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //設定綁定物件
        setRid();


        //做實作物件用自己做的類別來使用寫的函數
        shpf = new Shpf(this);


        //記住密碼的checkbox監聽器 當被按下是觸發
        keepword_checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //如果被勾選就記住密碼，否則不記住
                if(keepword_checkbox.isChecked()){
                    shpf.setName(edittext_username.getText().toString());
                    shpf.setName(edittext_password.getText().toString());
                    Toast.makeText(MainActivity.this , "記住密碼",Toast.LENGTH_LONG).show();
                }
                else{
                    shpf.setName("");
                    shpf.setName("");
                    Toast.makeText(MainActivity.this , "取消記住",Toast.LENGTH_LONG).show();
                }
            }
        });


        //當登入按下做動作
        Login_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this , "登入成功",Toast.LENGTH_LONG).show();
            }
        });



    }
    //綁定
    private void setRid(){
        edittext_password = findViewById(R.id.edit_password);
        edittext_username = findViewById(R.id.edit_username);
        Login_Button = findViewById(R.id.main_button);
        keepword_checkbox = findViewById(R.id.Cb);
    }
}