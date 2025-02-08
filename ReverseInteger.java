import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {  
 
       
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter any number : "); 
       int no = scanner.nextInt(); 
       int result= ReverseInt(no);
        System.out.println(result);
    }


    public static int ReverseInt(int no) {
        boolean flag = false;
        if(no<0){
            no= 0-no;
            flag = true;
        }
         int rev=0;
         int r;
       
        int p = no;
        while(p>0){
            r= p%10;
            rev = rev *10+r;
            p = p/10;

        }
        if(flag){
            rev = 0-rev;
        }
        return rev;
    }
}
