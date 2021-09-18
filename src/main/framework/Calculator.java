package main.framework;

import java.util.ArrayList;

public interface Calculator {

    /**
     * calculates the sum a+b
     * @return the sum of a and b
     */
    public int addition(ArrayList<Integer> numbers);

    /**
     * calculates the difference a-b
     * @return the difference of a and b
     */
    public int subtraction(int a, int b);

    /**
     * calculates the multiplication a*b
     * @return the multiplication of a and b
     */
    public int multiplication(int a, int b);

    /**
     * calculates the divison a/b
     * @return result of the divison a/b
     */
    public int division(int a, int b);



}
