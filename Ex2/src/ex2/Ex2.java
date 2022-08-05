
/*
  Write a program that reads an integer and displays all its smallest factors
  in increasing order. For example, if the input integer is 120, the output
  should be as follows: 2, 2, 2, 3, 5.
*/
package ex2;

import java.util.Scanner;

public class Ex2 {
    
    private static boolean isPrime(int n) {
        if (n < 2) { 
            return false; 
        }
        if (n == 2) { 
            return true;
        }
        if (n % 2 == 0) { 
            return false; 
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; 
            }
        }
    return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("The factor of this integer are: ");
        
        int i = 2;
        while(n != 1){
            if(n % i == 0){
                if(isPrime(i)){
                    System.out.print(i + " ");
                    n /= i;  // n = n / i
                }
            }
            else
                i++;
        }
        System.out.println();
    }
    
}
