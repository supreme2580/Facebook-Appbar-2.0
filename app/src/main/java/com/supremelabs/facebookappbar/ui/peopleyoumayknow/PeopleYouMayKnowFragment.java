package com.supremelabs.facebookappbar.ui.peopleyoumayknow;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.supremelabs.facebookappbar.R;

public class PeopleYouMayKnowFragment extends Fragment {

    public PeopleYouMayKnowFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_people_you_may_know, container, false);
    }
}