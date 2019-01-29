package com.android4dev.navigationview.common;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;

import com.android4dev.navigationview.LiveStreamActivity;

import java.lang.ref.WeakReference;

/**
 * Created by Alvin on 2016-05-20.
 */
public class MyHandler extends Handler {
    private final WeakReference<LiveStreamActivity> mActivity;

    public MyHandler(LiveStreamActivity activity) {
        mActivity = new WeakReference<LiveStreamActivity>(activity);
    }

    @Override
    public void handleMessage(Message msg) {
        LiveStreamActivity activity = mActivity.get();
        if (activity != null) {
            try {
                activity.mLastFrame = (Bitmap) msg.obj;
            } catch (Exception e) {
                e.printStackTrace();
            }
            super.handleMessage(msg);
        }
    }
}