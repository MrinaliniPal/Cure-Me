package com.example.mrinalinigalle.cureme;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Mrinalini galle on 23-03-2016.
 */
public class ColdAloTabPager extends FragmentPagerAdapter {

    public ColdAloTabPager(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    // Holds tab titles
    private String tabTitles[] = new String[]{"Doctors", "Pharmacy"};


    @Override
    public int getCount() {
        return 2;
    }

    // Return the correct Fragment based on index
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ColdAloFrag1();
        } else if (position == 1) {
            return new ColdAloFrag2();
        }

        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Return the tab title to SlidingTabLayout
        return tabTitles[position];
    }
}
