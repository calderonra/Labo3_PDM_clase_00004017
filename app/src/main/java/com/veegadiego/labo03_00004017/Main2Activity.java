package com.veegadiego.labo03_00004017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTextView=findViewById(R.id.tv_mensaje);
        Intent mIntent=getIntent();
        if(mIntent!=null){
            mTextView.setText(mIntent.getStringExtra(AppConstant.TEXT_KEY));
        }
    }
}
