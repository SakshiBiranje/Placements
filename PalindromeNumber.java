import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int x = sc.nextInt(); 
        sc.close();
        if(palindromeCheck(x))
        {
            System.out.println("palindrome number");

        }  
        else{
            System.out.println("Not palindrome number");
        }
        
    }
    public static boolean palindromeCheck(int x){
        int original = x;
        int rev = 0;
        int r;
        if(x<0)
        return false;
        while(x!=0){
            r = x %10;
            rev = rev*10 + r;
            x /=10;
        }
        
        return rev ==original;
    }
}
