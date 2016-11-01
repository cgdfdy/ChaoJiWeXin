package cn.ucai.superwechat.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hyphenate.chatuidemo.R;

public class SplashActivity extends AppCompatActivity {

    private final long sleepTime = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
    @Override
    protected void onStart() {
        super.onStart();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, cn.ucai.superwechat.ui.MainActivity.class));
                finish();
            }
        }, sleepTime);
    }
}

