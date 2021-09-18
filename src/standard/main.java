package standard;

import main.framework.Calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //SETUP
        Calculator c = new CalculatorImp();
        boolean active = true;
        //

        System.out.println("WELCOME TO CALCULATOR ITERATION 1!");
        System.out.println("THIS CALCULATOR ONLY SUPPORTS THE 4 MOST BASIC OPERATIONS:\n 1.Addition \n 2.Subtstraction \n 3.Multiplication \n 4.Division");
        System.out.println("OBS: Division only allows integer division and rounds up.");
        System.out.println("");
        System.out.println("TO START, PLEASE CHOOSE A NUMBER FROM 1-4 CORRESPONDING TO THE OPERATIONS RESPECTIVELY, AND TYPE 2 INTEGERS.");
        System.out.println("TYPE A TO STOP THE CALCULATOR");
        System.out.println("----------------------------------------");
        Scanner sc = new Scanner(System.in);

        while(active){
            System.out.println("Choose an operation 1-4:");
            String opAnswer= sc.next();
            System.out.println("Choose first number:");
            int firstNumber = sc.nextInt();
            System.out.println("Choose second number:");
            int secondNumber = sc.nextInt();

            switch (opAnswer){
                case "1":
                    int sum = c.addition(firstNumber,secondNumber);
                    System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
                    active = false;
                    System.out.println("Another calculation? y/n");
                    String answer = sc.next();
                    if(answer.equals("y")){
                        active = true;
                    }
                    else{
                        break;
                    }
                    break;
                case "2":
                    int difference = c.subtraction(firstNumber,secondNumber);
                    System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
                    System.out.println("Another calculation? y/n");
                    String answer1 = sc.next();
                    if(answer1.equals("y")){
                        active = true;
                    }
                    else{
                        active = false;
                        break;
                    }
                    break;

                case "3":
                    int multiplication = c.multiplication(firstNumber,secondNumber);
                    System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);
                    System.out.println("Another calculation? y/n");
                    String answer2 = sc.next();
                    if(answer2.equals("y")){
                        active = true;
                    }
                    else{
                        active = false;
                        break;
                    }

                case "4":{
                    int division = c.division(firstNumber,secondNumber);
                    System.out.println(firstNumber + " / " + secondNumber + " = " + division);
                    System.out.println("Another calculation? y/n");
                    String answer3 = sc.next();
                    if(answer3.equals("y")){
                        active = true;
                    }
                    else{
                        active = false;
                        break;
                    }
                }
            }
        }




    }
}
