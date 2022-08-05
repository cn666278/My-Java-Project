
package javaapplication12_binarysearch;

import java.util.Scanner;

public class JavaApplication12_BinarySearch {

    public static int binarySearch(int list[], int key){
        int low = 0;
        int high = list.length - 1;
        int count = 1;
        
        while(high >= low){
            int mid = (low + high) / 2;
            if(key < list[mid])
                high = mid - 1;
            /*
            else if((key == list[mid]) && (count == 1)){
                System.out.println("The times of Binary search is: 1");
                return mid;
            }*/
            else if(key == list[mid]){
                System.out.println("The times of Binary search is: " + count);
                return mid;
            }                            
            else    // key > list[mid]
                low = mid + 1;
            count++;
        }
        System.out.println("The times of Binary search is: " + count);
        return -low - 1;    // high < low, key not found
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int list[] = {2, 4, 5 , 6, 10, 33, 40, 80};
        System.out.println("Enter the value you want to search: " );
        int i = input.nextInt();
        int result = JavaApplication12_BinarySearch.binarySearch(list, i); 
        System.out.println("The index of your search number is: " + result);
        
    }
}
