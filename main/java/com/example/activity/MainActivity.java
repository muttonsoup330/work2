package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("name","zhangsan");
                intent.putExtra("age",20);
                startActivityForResult(intent,0);
            }
        });
        Button button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity3.class);
                intent.putExtra("name","zhangsan");
                intent.putExtra("age",20);
                startActivityForResult(intent,1);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        TextView text1=findViewById(R.id.text1);
        if(requestCode==0){
            String str=data.getStringExtra("result");
            if(resultCode==0){
                text1.setText(str);
            }
            else if(resultCode==1){
                text1.setText("lisi启动失败");
            }
        }
        if(requestCode==1){
            String str=data.getStringExtra("result");
            if(resultCode==0){
                text1.setText(str);
            }
            else if(resultCode==1){
                text1.setText("wangwu启动失败");
            }
        }
    }
}