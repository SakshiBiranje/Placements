//Check if One String Swap Can Make Strings Equal
import java.util.*;
//i/p : s1 = bank    s2 = kanb
public class StringEqualsCheck{
    public boolean areAlmostEqual(String s1, String s2) {
        int n =s1.length();
        if(s1.equals(s2))
            return true;
            int first =-1;
            int second =-1;
            int count =0;
        for(int i=0;i<n ;i++){
       
        if(s1.charAt(i) != s2.charAt(i)){
            count ++;
        if(count ==1){
            first =i;
        }
        else if(count==2){
            second =i;
        }
        else{
            return false;
        }
    }
        }
    
    return (count ==2) &&
    s1.charAt(first)== s2.charAt(second) &&
    s2.charAt(first)== s1.charAt(second);
}

public static void main(String[] args) {
    String s1 = "bank";
    String s2 = "kanb";
    StringEqualsCheck obj = new StringEqualsCheck();
    Boolean result =obj.areAlmostEqual(s1, s2);
    System.out.println(result);
}
}