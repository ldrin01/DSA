import java.util.Scanner;
import java.util.Random;
public class LinearSearch {
    
    private int[] arr;
    
    public void show(){
        int x = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
            x += 1;
            if(x == 8){
                System.out.println();
                x = 0;
            }
        }
    }
    
    public void LinearSearch(int size){
        arr = new int[size];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(1000);
        }
    }
    
    public void toSearch(int search, int size){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == search){
                System.out.print("Found it on index [" + i + "]");
                break;
            }
            if( i == size-1){
                System.out.print("Didn't found it.");
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinearSearch call = new LinearSearch();
       
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        call.LinearSearch(size);
        
        call.show();
        
        System.out.print("\nSearch element: ");
        int search = input.nextInt();
        call.toSearch(search, size);
    }
}
