package com.magiclon.library;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：WangZhiQiang
 * 时间：2018/7/23
 * 邮箱：sos181@163.com
 * 描述：
 */

public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragments = new ArrayList<>();
    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
   public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> fragments){
       super(fm);
       this.fragments=fragments;

   }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
