package standard;

import main.framework.Calculator;

import java.util.ArrayList;

public class CalculatorImp implements Calculator {
    private int sum;

    public CalculatorImp(){
    }
    @Override
    public int addition(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    @Override
    public int subtraction(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }

    @Override
    public int division(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException("Division by 0 not allowed");
        }
        else{
            return a/b;
        }
    }
}
