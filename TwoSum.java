import java.util.HashMap;
import java.util.Arrays;
public class TwoSum{
    public static void main(String[] args){
        int[] nums= {1,4,5,7,9};
        int target =5;
        int[] res = SumIndex(nums, target);
        System.out.println(Arrays.toString(res));
        
    }
    public static int[] SumIndex(int [] nums , int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i< nums.length;i++){
            int complement = nums[i]- target;
            if(map.containsKey(complement)){
              return new int[]{  map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
    
}