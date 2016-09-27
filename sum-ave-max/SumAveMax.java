/** 
* - Accepts keyboard input to set array size.
* - Generate random numbers accordingly.
* - Get the sum, average, and maximum value
*
* @author  [Eldrin M. Bernardino]
* @link    [https://github.com/ldrin01]
* @version [version number]
* @since   [last updated 28/09/2016]
*/

import java.util.Scanner;
import java.util.Random;
public class SumAveMax {
    
    public int [] arr;
    public int max = 0;
    public int sum = 0;
    
    public void SumAveMax(int size){
        arr = new int[size];
        Random myrand = new Random();
        for(int i = 0; i < size; i++){
            arr[i] = myrand.nextInt(1000);
        }
    }
    
    public void show(){
        int ln = 0;
        System.out.println();
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + "\t");
            ln += 1;
            if(ln == 10){
                System.out.println();
                ln = 0;
            }
        }
    }
    
    public void getSum(){
        for(int i = 0; i < arr.length ; i++){
            sum += arr[i];
        } 
        System.out.println("\nSum =\t\t" + sum);
    }
    
    public void getAve(){ 
        double average = (float)sum / arr.length;  
        System.out.println("Average =\t" + average);
    }
    
    public void getMax(){
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max =\t\t" + max);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        SumAveMax call = new SumAveMax();
        int size = 0;
        System.out.print("Enter array size: ");
        size=input.nextInt();
        call.SumAveMax(size);
        
        call.show();
        call.getSum();
        call.getAve();
        call.getMax();
    }
}
