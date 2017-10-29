package com.example.yanvydra.activityhw;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.yanvydra.activityhw.Fragments.FragmentX;
import com.example.yanvydra.activityhw.Fragments.FragmentZ;

public class MainActivity extends AppCompatActivity {

    android.app.FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
    }


    public void addFragmentX(View v) {

        FragmentX fragmentX = new FragmentX();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fragmentX, "fragX");
        transaction.commit();
    }

    public void addFragmentZ(View v) {

        FragmentZ fragmentZ = new FragmentZ();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fragmentZ, "fragZ");
        transaction.commit();

    }


    public void showFragmentX(View v) {


        FragmentX fragmentX = (FragmentX) manager.findFragmentByTag("fragX");
        FragmentTransaction transaction = manager.beginTransaction();

        if (fragmentX != null) {
            transaction.show(fragmentX);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment X ", Toast.LENGTH_LONG).show();
        }


    }

    public void hideFragmentX(View v) {

        FragmentX fragmentX = (FragmentX) manager.findFragmentByTag("fragX");
        FragmentTransaction transaction = manager.beginTransaction();

        if (fragmentX != null) {
            transaction.hide(fragmentX);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment X", Toast.LENGTH_LONG).show();
        }

    }public void showFragmentZ(View v) {


        FragmentZ fragmentZ = (FragmentZ) manager.findFragmentByTag("fragZ");
        FragmentTransaction transaction = manager.beginTransaction();

        if (fragmentZ != null) {
            transaction.show(fragmentZ);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment Z ", Toast.LENGTH_LONG).show();
        }


    }

    public void hideFragmentZ(View v) {

        FragmentZ fragmentZ = (FragmentZ) manager.findFragmentByTag("fragZ");
        FragmentTransaction transaction = manager.beginTransaction();

        if (fragmentZ != null) {
            transaction.hide(fragmentZ);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment Z", Toast.LENGTH_LONG).show();
        }

    }

}

