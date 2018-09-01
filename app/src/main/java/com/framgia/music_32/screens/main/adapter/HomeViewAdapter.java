package com.framgia.music_32.screens.main.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.framgia.music_32.R;
import com.framgia.music_32.screens.main.offline.MyMusicFragment;
import com.framgia.music_32.screens.main.online.ChartFragment;
import com.framgia.music_32.screens.main.online.DiscoverFragment;
import com.framgia.music_32.screens.main.TabType;

public class HomeViewAdapter extends FragmentPagerAdapter {
    private static final int sNumberTab = 3;
    private Context mContext;

    public void setContext(Context context) {
        this.mContext = context;
    }

    public HomeViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case TabType.MYMUSIC:
                return new MyMusicFragment();
            case TabType.CHART:
                return new ChartFragment();
            case TabType.DISCOVER:
                return new DiscoverFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return sNumberTab;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case TabType.MYMUSIC:
                return mContext.getString(R.string.title_tab_myMusic);
            case TabType.DISCOVER:
                return mContext.getString(R.string.title_tabDiscover);
            case TabType.CHART:
                return mContext.getString(R.string.title_tabChart);
            default:
                return null;
        }
    }
}

