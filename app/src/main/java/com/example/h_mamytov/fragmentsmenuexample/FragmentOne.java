package com.example.h_mamytov.fragmentsmenuexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentOne extends Fragment {

    private static final int LAYOUT = R.layout.fragment_one;
    private View view;
    private Button btnOneRight;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        view = inflater.inflate(LAYOUT, container, false);
        btnOneRight = view.findViewById(R.id.button1_right);
        return view;

    }
}
