import java.util.*;

public class DigitsOccurence{
  /*
   * There may other integers present between 0 and 0,7
Example:
Input list : [2,0,5,0,7,3]
Output: 1 occurrence of 0,0,7
   */
// simple optimized solution
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> li = Arrays.asList(2,0,5,0,7,3);
        int count =0;
        for(int i=0;i<li.size()-2;i++){
            if(li.get(i) ==0 && li.get(i+2)==0 && li.get(i+3)==7){
                count ++;
            }
        }
       System.out.println(count + " occurrence of 0,0,7 ");
       

    }
   
}