package com.example.android.tourguide;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentStateAdapter {


    public SectionsPagerAdapter(Context context) {
        super((FragmentActivity) context);
    }

    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new PlacesFragment();
        } else if (position == 1) {
            return new MallsFragment();
        } else if (position == 2) {
            return new HotelsFragment();
        } else {
            return new NightLifeFragment();
        }
    }

    @Override
    public int getItemCount() {
        // Show 4 total pages.
        return 4;
    }


}
