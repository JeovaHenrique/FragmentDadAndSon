package com.example.fragmentdadson;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class FragmentSon extends Fragment {

    private Button btnSend;
    private EditText etFirstNumber, etSecondNumber;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_son, container,false);

        etFirstNumber = (EditText) view.findViewById(R.id.etFirstNumber);
        etSecondNumber = (EditText) view.findViewById(R.id.etSecondNumber);

        btnSend = (Button) view.findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });

        return view;

    }

    private void sendData() {

        int firstNum = Integer.valueOf(etFirstNumber.getText().toString());
        int secondNum = Integer.valueOf(etSecondNumber.getText().toString());

        MyListener myListener = (MyListener) getActivity();
        myListener.addTwoNumber(firstNum,secondNum);
    }

}
