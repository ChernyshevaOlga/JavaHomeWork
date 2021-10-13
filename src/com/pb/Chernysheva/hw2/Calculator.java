package com.pb.Chernysheva.hw2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите, пожалуйста, первое число: ");
        int operand1 = in.nextInt();
        System.out.println("введите, пожалуйста, второе число: ");
        int operand2 = in.nextInt();
        System.out.println("введите, пожалуйста, математический знак: ");
        String sign = in.next();
        switch(sign) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if(operand2==0) {
                    System.out.println("Учите правила!");
                    return;
                }
                System.out.println(operand1 / operand2);
                break;
        }
    }
}
