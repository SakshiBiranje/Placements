import java.util.Arrays;
import java.util.Scanner;
//reverse three numbers in array
class ReverseThreeNumbers{
    public static void reverethree(int[] arr, int k){
        int n = arr.length;
        for(int i=0;i< n;i+=k){
            int left =i;
            int right= Math.min(i+k-1 , n-1);
            while(left < right){
                int temp = arr[left];
                arr[left]= arr[right];
                arr[right]= temp;
                left ++;
                right--;
            }

          /* 
           *  for(int i=0;i<k;i++){
            for(int j=arr.length -1;j>0;j--){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
           }
          */

        }
    }

    public static void main(String[] args){
        int[] arr = { 1,2,3,4,5};
        int  k =3;
        reverethree(arr, k);
        System.out.println("Reversed Array  in order of : "+ k +Arrays.toString(arr));
    }
}