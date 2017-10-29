package com.example.yanvydra.activityhw.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yanvydra.activityhw.R;

/**
 * Created by YanVydra on 29.10.2017.
 */

public class FragmentX extends Fragment {

    private static final String TAG = "Fragment X";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "fragmentX oncreate");
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       Log.d(TAG, "fragmentX oncreateview");
        return inflater.inflate(R.layout.fragment_x, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "fragmentX onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "fragmentX onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "fragmentX onresume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "fragmentX onpause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "fragmentX onstop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "fragmentX ondestroy ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "fragmentX ondestroyview");
    }


}
