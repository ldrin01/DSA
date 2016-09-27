public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {66,34,56,67,78,89};
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The Smallest number is "+ min);
        System.out.println("The Largest number is "+ max);
    }
}
