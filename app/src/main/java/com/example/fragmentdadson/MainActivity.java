package com.example.fragmentdadson;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements MyListener{

    private FragmentManager manager;
    private int firstNum, secondNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();

        addFragmentSonA();
        addFragmentSonB();
    }

    private void addFragmentSonA() {

        FragmentSonA fragmentSonA = new FragmentSonA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragmentContainerSonA, fragmentSonA, "fragA");
        transaction.commit();

    }

    private void addFragmentSonB() {

        FragmentSonB fragmentSonB = new FragmentSonB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragmentContainerSonB, fragmentSonB, "fragB");
        transaction.commit();

    }

    @Override
    public void addTwoNumber(int num1, int num2){
        this.firstNum = num1;
        this.secondNum = num2;

        Toast.makeText(this, "Number received in Activity : " + num1 + ", " + num2, Toast.LENGTH_LONG).show();
    }

    public void SendDataToFragmentB(View view) {

        FragmentSonB fragmentSonB = (FragmentSonB) manager.findFragmentByTag("fragB");
        fragmentSonB.addTwoNumbersInFragmentB(firstNum,secondNum);
    }
}