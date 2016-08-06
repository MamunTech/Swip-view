package com.makerslabgmail.makerslab.mamun.fragmentpractice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by b on 8/6/2016.
 */
public class SwipeAdaptor extends FragmentStatePagerAdapter {
    public SwipeAdaptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragmetn =new Pagefragment();
        Bundle bundle=new Bundle();
        bundle.putInt("count",i+1);
        fragmetn.setArguments(bundle);
        return fragmetn;
    }

    @Override
    public int getCount() {
        return 7;
    }
}
