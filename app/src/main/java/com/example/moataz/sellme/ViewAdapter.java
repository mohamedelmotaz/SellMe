package com.example.moataz.sellme;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

public class ViewAdapter extends FragmentPagerAdapter {
    public ViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                FragmentOne fragmentOne=new FragmentOne();
                return fragmentOne;
            case 1:
                FragmentTow fragmentTow=new FragmentTow();
                return fragmentTow;
            case 2:
                FragmentThree fragmentThree=new FragmentThree();
                return fragmentThree;

        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
