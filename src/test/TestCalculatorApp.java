package test;

import org.junit.Test;
import org.junit.jupiter.api.*;
import main.framework.*;
import standard.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;


public class TestCalculatorApp {
    private Calculator c;

    @BeforeEach
    public void setUp(){
        c = new CalculatorImp();
    }

    @Test
    public void shouldReturnSumOfTwoNumbers(){
        System.out.println(c.addition(1,2));
    }
}

