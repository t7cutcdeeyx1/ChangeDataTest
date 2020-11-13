package com.example.changedatatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    int a ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.data);
        Intent intent=getIntent();

        textView.setText(intent.getIntExtra("data",1)+"");
        a=intent.getIntExtra("data",1)+1;
    }

    @Override
    public void finish(){
        Intent intent = new Intent();
        intent.putExtra("data",a);
        setResult(3, intent);
        super.finish();
    }
}
