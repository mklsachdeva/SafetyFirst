package com.example.vikas.safetyfirst.mKnowitActivity.Ladders.mSelfSupportingLadder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vikas.safetyfirst.R;

/**
 * Created by Vikas on 31-07-2016.
 */
public class PlatformFragment extends Fragment {

    public PlatformFragment(){}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.platform_ladder, container, false);
    }
}