import java.util.Arrays;
public class MaximumSubArray{
    public static int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[1];
        }
        int sum= nums[0];
        for(int i=1;i<=nums.length-1;i++){
            sum=sum+nums[i];
            nums[i]=sum;
        }
        System.out.println(Arrays.toString(nums));
        int max=nums[0];
        int right=0;
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]>=max){
                max=nums[i];
                right=i;
            }
        }
        int min=nums[0];
        int left=0;
        for(int i=0;i<=right;i++){
            if(nums[i]<=min){
                min=nums[i];
                left=i;
            }
        }
        System.out.println(left+" "+right);
      int out=0;
      if(left==0 ){
        out=nums[right]-nums[left]+nums[left];
      }
      else{
        out=nums[right]-nums[left];
      }
    return out;
        
    }
    public static void main(String[] args) {
        int[] arr1={5,4,-1,7,8};
        maxSubArray(arr1);
        
    }

}
    
