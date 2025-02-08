/*
Check whether the given number lies in the Fibonacci series or not
(fib seq: 0,1,1,2,3,5,8,13,21….)

Find the maximum two-digit number present in the given big integer
Ex. I/p: 7649833

Ans. 98
*/
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        System.out.println("Enter numbers :");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("input :" );
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+ " ");
        }
        System.out.println();
       IsFibbonci(arr);
       
    }
    static boolean IsFibbonci(int[] arr){
        for(int i=0;i<=arr.length;i++){
            int sum = arr[i]+ arr[i+1];
                if(sum == arr[i+2]){
                    System.out.println("yes Fibboncci");
                   break;
                } 
                else{
                   System.out.println("not Fibboncci");
                   break;

               }
               
            
        }
        
                return false;
    }
}