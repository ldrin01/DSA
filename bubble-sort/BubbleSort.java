/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  [Eldrin M. Bernardino]
* @link    [https://github.com/ldrin01]
* @version [version number]
* @since   [last updated 28/09/2016]
*/

// TODO: import Scanner and Random from Java library

import java.util.Scanner;
import java.util.Random;
public class BubbleSort {
    
    public int[] arr;
    
    public void BubbleSort(int size){
        arr = new int [size];
        Random myran = new Random();
        for(int i = 0; i < size; i++){
            arr[i] = myran.nextInt(10000);
        }
        System.out.print("\t\t\t      RANDOMIZED ARRAY\n");
        int line = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
            line+=1;
            if (line == 10){
                System.out.println();
                line = 0;
            }
        }
        int temp = 0;
        for(int q = 0; q < size-1; q++){
            for(int w = 0; w < (size-q)-1; w++){
                if(arr[w] > arr[w+1]){
                    temp = arr[w];
                    arr[w] = arr[w+1];
                    arr[w+1] = temp;
                }
            }
        }
        System.out.print("\n\n\t\t\t\tSORTED ARRAY\n");
        line = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
            line+=1;
            if (line == 10){
                System.out.println();
                line = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        BubbleSort call = new BubbleSort();
        int size = 0;
        System.out.print("Enter array size: ");
        size = input.nextInt();
        call.BubbleSort(size);
        System.out.println();
    }

}
