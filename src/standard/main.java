package standard;

import main.framework.Calculator;

import java.util.ArrayList;
import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import org.mariuszgromada.math.mxparser.*;

public class main {
    public static void main(String[] args) throws ScriptException {

        /**
         * START OF ITERATION 3
         */
        boolean active = true;


        System.out.println("WELCOME TO CALCULATOR !");
        System.out.println("TO START, JUST TYPE IN AN EXPRESSION TO CALCULATE. PRESS A TO EXIT. Type help for help");
        System.out.println("----------------------------------------");
        Scanner sc = new Scanner(System.in);

        while(active){
            String expression = sc.nextLine();
            if(expression.equals("a")){
                active = false;
            }
            else if(expression.equals("help")){
                mXparser.consolePrintHelp();
            }
            else{
                Expression e1 = new Expression(expression);
                System.out.println(">>>>>>>>>>>>>>>>>>>> " + (e1.calculate()));
            }
        }


    }



}
