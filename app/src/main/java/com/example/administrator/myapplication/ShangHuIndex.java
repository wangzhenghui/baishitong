package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2016/7/9.
 */
public class ShangHuIndex extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indexshanghu);
    }
    public void yonghu_btn(View view){
        Intent intent = new Intent();
        intent.setClass(ShangHuIndex.this,ManActivity.class);
        startActivity(intent);
    }
    public void sh_zhuce(View view){
        Intent intent = new Intent();
        intent.setClass(ShangHuIndex.this,ShuZhuCe.class);
        startActivity(intent);
    }
    public void shanghu_zhuce(View view){
        Intent intent = new Intent();
        intent.setClass(ShangHuIndex.this,ShuZhuCe.class);
        startActivity(intent);
    }
    public void btn_back(View v) {     //标题栏 返回按钮
        this.finish();
    }
}
