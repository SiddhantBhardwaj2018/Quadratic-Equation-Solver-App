package com.siddhantbhardwaj.quadraticequationsolver;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.siddhantbhardwaj.quadraticequationsolver.databinding.ActivityMainBinding;

public class MyEquation extends BaseObservable {

    String a;
    String b;
    String c;

    ActivityMainBinding binding;

    public MyEquation(ActivityMainBinding binding) {
        this.binding = binding;
    }

    public MyEquation() {
    }

    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void solveEquation(View view){
        int a = Integer.parseInt(getA());
        int b = Integer.parseInt(getB());
        int c = Integer.parseInt(getC());

        double discriminant = Math.pow(b,2) - 4*a*c;
        double x1,x2;

        if(discriminant > 0){
            x1 = (-b + Math.sqrt(discriminant)) / 2*a;
            x2 = (-b - Math.sqrt(discriminant)) / 2*a;
            binding.text2.setText("X1= " + x1 + " ,X2= " + x2);
        }else if(discriminant < 0){
            binding.text2.setText("No real roots (Complex solutions");
        }else{
            x1 = -b / (2 * a);
            binding.text2.setText("x= " + x1);
        }


    }

}
