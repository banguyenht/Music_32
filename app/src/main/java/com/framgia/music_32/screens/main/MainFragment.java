package com.framgia.music_32.screens.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.framgia.music_32.R;
import com.framgia.music_32.screens.main.adapter.HomeViewAdapter;


public class MainFragment extends Fragment {
    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    public void initViews(View view) {
        ViewPager mViewPager = view.findViewById(R.id.viewpagerPager);
        HomeViewAdapter mAdapter = new HomeViewAdapter(getChildFragmentManager());
        mAdapter.setContext(getContext());
        mViewPager.setAdapter(mAdapter);
        TabLayout mTabLayout = view.findViewById(R.id.tablayout);
        mTabLayout.getTabAt(TabType.MYMUSIC).setIcon(R.drawable.ic_mymusic);
        mTabLayout.getTabAt(TabType.DISCOVER).setIcon(R.drawable.disc);
        mTabLayout.getTabAt(TabType.CHART).setIcon(R.drawable.ic_tab_chart);
    }
}
