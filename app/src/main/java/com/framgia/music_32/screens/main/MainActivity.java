package com.framgia.music_32.screens.main;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.framgia.music_32.R;

public class MainActivity extends AppCompatActivity {
    private MainFragment mMainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    private void initViews(){
        mMainFragment = MainFragment.newInstance();
        FragmentManager manager= getSupportFragmentManager();
        FragmentTransaction transaction= manager.beginTransaction();
        transaction.replace(R.id.frame_container, mMainFragment);
        transaction.commit();
    }
}
