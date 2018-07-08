package com.saurabh.tutorial.java.view.fragments;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saurabh.tutorial.java.R;
import com.saurabh.tutorial.java.binding.FragmentDataBindingComponent;
import com.saurabh.tutorial.java.databinding.FragmentHomeBinding;
import com.saurabh.tutorial.java.di.Injectable;

public class HomepageFragment extends Fragment implements Injectable {

     DataBindingComponent dataBindingComponent = new FragmentDataBindingComponent(this);

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentHomeBinding dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home,
                container, false, dataBindingComponent);
        return dataBinding.getRoot();
    }
}
