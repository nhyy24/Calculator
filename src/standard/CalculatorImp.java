package standard;

import main.framework.Calculator;

public class CalculatorImp implements Calculator {

    public CalculatorImp(){
    }
    @Override
    public int addition(int a, int b) {
        return a+b;
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
