package com.example.zhou.iconfontdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       //LayoutInflaterCompat.setFactory(getLayoutInflater(), new IconFontLayoutFactory(this, getDelegate()));
        super.onCreate(savedInstanceState);

        initDatas();
        initViews();

    }

    protected void initDatas() {
    }

    protected void initViews() {
        
    }

}
