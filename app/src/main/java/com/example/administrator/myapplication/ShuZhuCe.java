package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2016/7/8.
 */
public class ShuZhuCe extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shanghu_zhuce);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    public void welcome_geren(View view){//个人加盟
        Intent intent = new Intent();
        intent.setClass(ShuZhuCe.this,GeRenJiaMen.class);
        startActivity(intent);
    }
    public void welcome_gongsi(View view){//公司加盟
        Intent intent = new Intent();
        intent.setClass(ShuZhuCe.this,GongSiJiaMen.class);
        startActivity(intent);
    }
}
