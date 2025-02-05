import java.util.Scanner;
import java.util.Arrays;

class ArrayBasics{
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array : ");
    int n = sc.nextInt();
    int[] nums = new int[n];
    System.out.print("Enter array elements : ");
    for(int i=0;i< n ;i++){
        nums[i]= sc.nextInt();
    }
    System.out.print("Reverse array : ");
    for(int i=n-1 ; i>0;i--){
        System.out.print(nums[i] +" "); ;
    }
    System.out.println();
    Arrays.sort(nums);
    System.out.println("Smallest Element : "+ nums[0]);
    System.out.println("Largestest Element : "+ nums[n-1]);
    System.out.println("Second Smallest Element : "+ nums[1]);
    System.out.println("Second Largestest Element : "+ nums[n-2]);
  
 }   
}