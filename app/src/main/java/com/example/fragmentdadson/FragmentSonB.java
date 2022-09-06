package com.example.fragmentdadson;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentSonB extends Fragment {

    private TextView txvResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_son_b, container,false);

        txvResult = (TextView) view.findViewById(R.id.txvResult);

        return view;

    }

    public void addTwoNumbersInFragmentB(int x, int y) {

        int result = x + y;
        txvResult.setText("Result : " + result);

    }

}
