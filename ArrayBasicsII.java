import java.util.*;

class ArrayBasicsII{
 
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array : ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter array elements : ");
    for(int i=0;i< n ;i++){
        arr[i]= sc.nextInt();
    }
    countFrequency(arr);

   }
   public static void countFrequency(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
      
        for(int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
    
        System.out.println("Element Frequency:");
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}