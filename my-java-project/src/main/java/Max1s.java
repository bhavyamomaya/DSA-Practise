public class Max1s{
    public static int singleNumber(int[] nums) {   
       int  answer=0;
        int x=0;
        for(int i=0;i<=nums.length-1;i++){        
            for(int j=0;j<=nums.length-1;j++){
                if(nums[i]==nums[j] && i!=j){
                    x=1;
                }               
            }
            System.out.println(x);
            if(x==0){
                answer=nums[i];
            }
            x=0;
        }
        return answer;     
    }
    public static void main(String[] args) {
       int[] arr1={1};
       System.out.println(singleNumber(arr1));        
    }
}
    

