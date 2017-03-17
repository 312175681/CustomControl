package com.example.lxd.customcontrol;

import android.view.View;
import android.view.animation.RotateAnimation;

/**
 * Created by lxd on 2017/3/16.
 */

public class Tools {
    public static void hideView(View view) {
        hideView(view, 0);
    }

    public static void showView(View view) {
        showView(view, 0);
    }

    public static void hideView(View view, int startOffset) {
        RotateAnimation ra = new RotateAnimation(0, 180, view.getWidth()/2,view.getHeight());
        ra.setDuration(1000);
        ra.setFillAfter(true);
        ra.setStartOffset(startOffset);
        view.startAnimation(ra);
    }
    public static void showView(View view, int startOffset) {
        RotateAnimation ra = new RotateAnimation(0, 180, view.getWidth()/2,view.getHeight());
        ra.setDuration(1000);
        ra.setFillAfter(true);
        ra.setStartOffset(startOffset);
        view.startAnimation(ra);
    }
}
