package com.saurabh.tutorial.java.view.common;

import android.support.v4.app.FragmentManager;

import com.saurabh.tutorial.java.R;
import com.saurabh.tutorial.java.view.activity.HomePage;
import com.saurabh.tutorial.java.view.fragments.HomepageFragment;

import javax.inject.Inject;

/**
 * A utility class that handles navigation in {@link HomePage}.
 */
public class NavigationController {
    private final int containerId;
    private final FragmentManager fragmentManager;

    @Inject
    public NavigationController(HomePage mainActivity) {
        this.containerId = R.id.container;
        this.fragmentManager = mainActivity.getSupportFragmentManager();
    }

    public void navigateToSearch() {
        HomepageFragment mainFragment = new HomepageFragment();
        fragmentManager.beginTransaction()
                .replace(containerId, mainFragment)
                .commitAllowingStateLoss();
    }
}
