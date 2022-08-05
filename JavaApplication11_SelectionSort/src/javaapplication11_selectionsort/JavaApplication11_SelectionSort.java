/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11_selectionsort;

public class JavaApplication11_SelectionSort {
    /** The method for sorting the number */
    public static void selectionSort(double[] list){
        for(int i = 0; i < list.length - 1; i++ ){
            // Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;
            for(int j = i + 1; j < list.length; j++){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary
            //list[i] is the first one in unsorted list
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }  
        }     
    }
    
    public static void main(String[] args) {
        double list[] = {1, 9.2, 4.5, 7.1, -3, 0};
        JavaApplication11_SelectionSort.selectionSort(list);
        for(int i = 0; i < list.length - 1; i++){
            System.out.print(list[i] + "\t");
        }
        
    }
    
}
