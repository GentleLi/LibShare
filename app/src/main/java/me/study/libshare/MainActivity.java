package me.study.libshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.study.share.ShareUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShareUtils shareUtils = ShareUtils.getmInstance();
        shareUtils.init(getApplicationContext());
        shareUtils.doShare("QQ", 3);

    }
}
