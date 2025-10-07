import java.util.*;
class Solution2 {
    public static int maxSum(int[] nums) {
        int left=0;
        int sum=0;
        int maxsum=0;
        Boolean negenc=false;
        int max=nums[0];
        if(nums.length==1){
            return nums[0];
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]<=0){             

                if(negenc=false){
                    max=nums[i];
                }
                else{
                    if(nums[i]>max){
                        max=nums[i];
                    }
                }
            nums[i]=0;
            negenc= true;
            }else{
                if(hs.contains(nums[i])){                 
                    sum=sum+nums[i];
                    while(hs.contains(nums[i])){
                        sum=sum-nums[left];
                        if(nums[left]!=0){
                        hs.remove(nums[left]);
                        }
                        left++;
                    }
                        hs.add(nums[i]);
                    }
                    else{
                        hs.add(nums[i]);
                        sum=sum+nums[i];
                    }
                }
            }
            if(sum==0){
                return max;               
            }
            if(sum>maxsum){
                maxsum=sum;
            }
            return maxsum;  
        }
        public static void main(String[] args) {
            int[] arr ={-17,-15};
            System.out.println(maxSum(arr));
        }    

    }
