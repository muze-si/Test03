package com.example.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {
    private Button bt;
    private EditText input1;
    private EditText input2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        bt = (Button) findViewById(R.id.bt_add);
        input1=(EditText) findViewById(R.id.group_name);
        String str1=input1.toString();
        input2=(EditText) findViewById(R.id.group_use);
        String str2=input2.toString();
        bt.setOnClickListener(new View.OnClickListener() {//创建监听器
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("newname", str1);
                bundle.putString("newuse", str2);
                Intent intent = new Intent(AddActivity.this,MainActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}