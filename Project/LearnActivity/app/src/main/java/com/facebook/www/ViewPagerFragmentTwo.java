package com.facebook.www;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewPagerFragmentTwo extends Fragment {


    public ViewPagerFragmentTwo() {
        // Required empty public constructor
    }

    public static ViewPagerFragmentTwo newInstance()
    {
        return new ViewPagerFragmentTwo();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_pager_fragment_two, container, false);
    }

}
