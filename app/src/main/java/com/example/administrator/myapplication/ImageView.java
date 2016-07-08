package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2016/7/8.
 */
public class ImageView extends Activity {
    private RoundImageView roundImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.roundImageView = new RoundImageView(this);
        setContentView(roundImageView);
    }
}
