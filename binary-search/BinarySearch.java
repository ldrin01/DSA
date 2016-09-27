/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Eldrin M. Bernardino]
* @link    [https://github.com/ldrin01]
* @version [version number]
* @since   [last updated 28/09/2016]
*/

import java.util.Random;
import java.util.Scanner;
public class BinarySearch {
    
    private int[] arr;
    
    public void BinarySearch(int size){
        arr = new int[size];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(10000);
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
    
    public void toFind(int find){
        int left = 0, right = arr.length;
        int middle = ((left+right)/2)-1;
        int found = 0;
        do{
            for(int i = left; i < middle; i++){
                if(arr[i] == find){
                System.out.print("FOUND! At index ["+i+"]\n");
                found = 1;
                break;
                }
            }
            if(arr[middle] == find){
                System.out.print("FOUND! At index ["+middle+"]");
                found = 1;
                break;
            }else{
                left = middle +1;
                middle = (left+right)/2;
            }
        }while(found == 0&&middle!=right);
        
        if(found == 0){
            System.out.print("NOT FOUND\n");
        }  
    }
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        BinarySearch call = new BinarySearch();
        
        int size, find;
        System.out.print("Enter array size: ");
        size = input.nextInt();
        call.BinarySearch(size);
     
        System.out.print("\n\nEnter number to find: ");
        find = input.nextInt();
        call.toFind(find);
    }
}
