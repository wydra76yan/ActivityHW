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


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("HOOP", "fragmentX oncreate");
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       Log.d("HOOP", "fragmentX oncreateview");
        return inflater.inflate(R.layout.fragment_x, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        Log.d("HOOP", "fragmentX onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("HOOP", "fragmentX onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("HOOP", "fragmentX onresume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("HOOP", "fragmentX onpause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("HOOP", "fragmentX onstop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("HOOP", "fragmentX ondestroy ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("HOOP", "fragmentX ondestroyview");
    }


}
