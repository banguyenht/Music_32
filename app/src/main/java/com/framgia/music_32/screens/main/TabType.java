package com.framgia.music_32.screens.main;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({TabType.MYMUSIC, TabType.CHART, TabType.DISCOVER})
@Retention(RetentionPolicy.SOURCE)
public @interface TabType {
    int MYMUSIC = 0;
    int CHART = 1;
    int DISCOVER = 2;
}
