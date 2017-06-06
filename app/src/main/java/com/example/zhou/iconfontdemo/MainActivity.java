package com.example.zhou.iconfontdemo;

public class MainActivity extends BaseActivity {

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_main);

        FontHelper.injectFont(findViewById(R.id.ll));
    }
}
