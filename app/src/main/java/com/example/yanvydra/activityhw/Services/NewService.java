package com.example.yanvydra.activityhw.Services;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import java.util.concurrent.TimeUnit;

/**
 * Created by YanVydra on 29.10.2017.
 */

public class NewService extends IntentService {

    private final String TAG = "IntentServiceLogs";

    public static final String ACTION_NEWSERVICE = "com.example.yanvydra.activityhw.RESPONSE";
    public static final String EXTRA_KEY_OUT = "EXTRA_OUT";
    String extraOut = "Done";


    public NewService() {
        super("myname");
    }

    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        int tm = intent.getIntExtra("time", 0);
        String label = intent.getStringExtra("task");
        Log.d(TAG, "onHandleIntent start: " + label);
        try {
            TimeUnit.SECONDS.sleep(tm);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.d(TAG, "onHandleIntent end: " + label);

        Intent responseIntent = new Intent();
        responseIntent.setAction(ACTION_NEWSERVICE);
        responseIntent.addCategory(Intent.CATEGORY_DEFAULT);
        responseIntent.putExtra(EXTRA_KEY_OUT, extraOut);
        sendBroadcast(responseIntent);
    }
}
