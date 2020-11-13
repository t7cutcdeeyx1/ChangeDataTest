package com.example.changedatatest;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button jump ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jump=findViewById(R.id.jump);

        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("data",new Random().nextInt(10));
                startActivityForResult(intent,3);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        // 处理Activity数据的回传
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 3) {
            int str = data.getIntExtra("data",1);
            Toast.makeText(MainActivity.this, "MainActivity2的回传数据：" + str, Toast.LENGTH_SHORT).show();
        }
    }
}
