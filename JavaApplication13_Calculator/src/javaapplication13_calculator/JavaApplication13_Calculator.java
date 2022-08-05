/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13_calculator;

import java.util.Scanner;

public class JavaApplication13_Calculator {

    /* 此程序需要在cmd模式下运行，用到了args输入 */
    public static void main(String[] args) {

        System.out.println("java Calculator(num op num): ");
        
        if(args.length != 3){
            System.out.println("Usage: java calculator operand1 operator operand2");
            System.exit(1);
        }
        
        int result = 0;
        switch(args[1].charAt(0)){
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); //parseInt: convert String to Int
                break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case 'x':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
            default:
                System.out.println("Error operator.");
                System.exit(1);
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
    
}
