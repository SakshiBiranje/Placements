import java.util.*;

public class RemoveDuplicate {
    public static void FindDuplicate(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println("After removing duplicates : ");
        System.out.println(arr[0]+" ");
        for(int i=1;i<n;i++){
           if(arr[i] !=arr[i-1]){
            System.out.println(arr[i]+ " ");
            
           }
           
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        FindDuplicate(arr);
    }
}
