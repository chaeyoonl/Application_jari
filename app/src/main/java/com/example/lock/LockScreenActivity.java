package com.example.lock;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

public class LockScreenActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock_screen);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED
                | WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);
    }
// 나머지는 알아서 구성하기!
}

