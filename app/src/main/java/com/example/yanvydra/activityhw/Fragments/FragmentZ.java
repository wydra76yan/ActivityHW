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

public class FragmentZ extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("HOOP", "fragmentZ oncreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("HOOP", "fragmentZ oncreateview");
        return inflater.inflate(R.layout.fragment_z, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        Log.e("HOOP", "fragmentZ onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
       Log.e("HOOP", "fragmentZ onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("HOOP", "fragmentZ onresume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("HOOP", "fragmentZ onpause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("HOOP", "fragmentZ onstop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("HOOP", "fragmentZ ondestroy ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("HOOP", "fragmentZ ondestroyview");
    }


}

