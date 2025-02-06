import java.util.*;

public class ReverseFromLeftToRight {
    public static void Reversed(int[] arr, int k){
        int n = arr.length;
        for(int i=0;i<n;i+=k){
            int left =i;
            int right= Math.min(i+k-1,n-1);
            while(left< right){
                int temp = arr[left];
                arr[left]= arr[right];
                arr[right]= temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7};
        int  k =arr.length;
        Reversed(arr, k);
        System.out.println("Array Reversed from left to right :"+ Arrays.toString(arr));
    }
}
