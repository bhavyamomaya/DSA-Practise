
import java.util.*;
class Solution {
    public static int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> hs= new HashSet<Integer>();
        int sum=0;
        int maxsum=0;
        int left=0;

        for(int i=0;i<=nums.length-1;i++){
            while(hs.contains(nums[i])){
                sum=sum-nums[left];
                hs.remove(nums[left]);
                left++;

            }
        hs.add(nums[i]);
        sum=sum+nums[i];
        if(sum>maxsum){
            maxsum=sum;
        }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr={5,2,1,2,5,2,1,2,5};
        System.out.println(maximumUniqueSubarray(arr));
    }
}