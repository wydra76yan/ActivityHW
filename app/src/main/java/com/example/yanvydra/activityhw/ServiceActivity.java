package com.example.yanvydra.activityhw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.yanvydra.activityhw.Services.NewService;

/**
 * Created by YanVydra on 29.10.2017.
 */

public class ServiceActivity extends AppCompatActivity {

    private TextView mInfoTextView;
    private MyBroadcastReceiver mMyBroadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.service_activity);

        mInfoTextView = (TextView) findViewById(R.id.textView);

        Intent intentNewService = new Intent(this, NewService.class);

        startService(intentNewService.putExtra("time", 3).putExtra("task",
                "Do SMTH one"));
        startService(intentNewService.putExtra("time", 1).putExtra("task",
                "Do SMTH second"));



        startService(intentNewService);

        mMyBroadcastReceiver = new MyBroadcastReceiver();

        IntentFilter intentFilter = new IntentFilter(
                NewService.ACTION_NEWSERVICE);
        intentFilter.addCategory(Intent.CATEGORY_DEFAULT);
        registerReceiver(mMyBroadcastReceiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mMyBroadcastReceiver);
    }

    public class MyBroadcastReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            String result = intent
                    .getStringExtra(NewService.EXTRA_KEY_OUT);
            mInfoTextView.setText(result);
        }
    }


}
