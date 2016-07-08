package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2016/7/7.
 */
public class ManActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    public void welcome_zhuce(View view){//跳到商户注册
        Intent intent = new Intent();
        intent.setClass(ManActivity.this,ShuZhuCe.class);
        startActivity(intent);
    }
    public void btn_zhuce(View view){//跳到商户注册
        Intent intent = new Intent();
        intent.setClass(ManActivity.this,YongHuZhuCe.class);
        startActivity(intent);
    }

}
