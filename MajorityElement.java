public class MajorityElement {
    public static void main(String[] args) {
        int[] arr= { 1,1,2,2,1,3,1,1,1};
        int ans = Majority(arr);
        System.out.println("majority Element : "+ans);
    }
    public static int Majority(int[] arr){
        int n = arr.length;
        if(n ==1){
            return n;
        }
        int count =1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                count ++;

               
            }
            if(count >=n/2){
                return arr[i];
            }
        }
        return 0;
    }
}
