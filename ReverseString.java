import java.util.Scanner;
import java.util.*;
import java.io.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
            return new StringBuilder(str).reverse().toString();

    }
}
