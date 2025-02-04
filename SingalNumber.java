public class SingalNumber {
    public static void main(String[] args){
        int[] nums = {1,2,3,1,2};
        System.out.println("Singal Number : "+ SingalNum(nums));
    }
    public static int SingalNum(int[] nums){
        int x=0;
        for(int a : nums){
            x=x^a;
        }
        
        return x;
    }
}
