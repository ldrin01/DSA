package binarysearch;
public class BinarySearch {
    public int MyArray[]={100,30,70,20,80,10,60,40,90,50,1,2,3,4,5,6,7,8,9,0,11,12,13};
    
    public void binary(int y){
        String found = "1";
        int container = 0;
        int position = 0;
        int upperBound = MyArray.length;
        int lowerBound = (MyArray.length - upperBound);
        int midPoint = (lowerBound+upperBound)/2;
        
        while(found == "1"){
            for(int s = lowerBound; s <= midPoint; s++){
                if(s < MyArray.length){
                    if(MyArray[s] == y){
                        found = "2";
                        container = MyArray[s];
                        position = s+1;
                        break;
                    }
                }else{
                    found = "3";
                }
            }
            if(found == "1"){
                lowerBound = midPoint + 1;
                upperBound = MyArray.length;
                midPoint = (lowerBound+upperBound)/2;
            }
//            if(lowerBound > upperBound){
//                found = "3";
//            }
//            if(MyArray[midPoint] > y){
//                lowerBound = MyArray[0];
//                upperBound = midPoint;
//                midPoint = (lowerBound+upperBound)/2;
//            }
//            if(MyArray[midPoint] < y){
//                lowerBound = midPoint;
//                upperBound = MyArray[9];
//                midPoint = (lowerBound+upperBound)/2;
//            }
//            if(MyArray[midPoint] == y){
//                found = "2";
//            }
        }
        if(found == "2"){
            System.out.println("Found it, the number is: " + container+ "\nIt's array index is "+position);
            
        }else if(found == "3"){
            System.out.println("Didn't found it, number " + y + " is not in array");
        }
        
        
        
    }
    
    public static void main(String[] args) {
        
        BinarySearch my = new BinarySearch();
        my.binary(12);
        
    }
}
