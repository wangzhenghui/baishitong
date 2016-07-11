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
        setContentView(R.layout.indexyonghu);
        //禁止横屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    public void yonghu_zhuce(View view){//跳到用户注册
        Intent intent = new Intent();
        intent.setClass(ManActivity.this,YongHuZhuCe.class);
        startActivity(intent);
    }
    public void yh_zhuce(View view){//跳到用户注册
        Intent intent = new Intent();
        intent.setClass(ManActivity.this,YongHuZhuCe.class);
        startActivity(intent);
    }
    public void shanghu_btn(View view){
        Intent intent = new Intent();
        intent.setClass(ManActivity.this,ShangHuIndex.class);
        startActivity(intent);
    }

}
