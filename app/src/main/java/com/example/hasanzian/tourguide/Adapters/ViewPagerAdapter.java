package com.example.hasanzian.tourguide.Adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.hasanzian.tourguide.fragments.TabFourFragment;
import com.example.hasanzian.tourguide.fragments.TabOneFragment;
import com.example.hasanzian.tourguide.fragments.SpotsFragment;
import com.example.hasanzian.tourguide.fragments.TabTwoFragment;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a Fragment (defined as a static inner class below).
        if (position == 0) {
            return new SpotsFragment();

        }
        else if(position == 1){
            return new TabTwoFragment();
        }
        else if(position == 2){
            return new TabOneFragment();
        }
        else {
            return new TabFourFragment();
        }

    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}