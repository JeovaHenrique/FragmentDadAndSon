package com.example.fragmentdadson;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements MyListener{

    FragmentManager manager;
    private TextView txvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
        txvResult = (TextView) findViewById(R.id.txvResult);

        addFragmentSon();
    }

    private void addFragmentSon() {

        FragmentSon fragmentSon = new FragmentSon();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragmentContainerSon, fragmentSon, "fragS");
        transaction.commit();

    }

    @Override
    public void addTwoNumber(int num1, int num2) {

        int result = num1 + num2;
        txvResult.setText("Result : " + result);
    }
}