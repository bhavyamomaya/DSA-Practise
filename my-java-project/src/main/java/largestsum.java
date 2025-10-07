public class largestsum {
        public static boolean check(int[] arr, int a, int b){
            int sum=0;
            int count=0;
            for(int i=0;i<=arr.length-1;i++){            
                if(arr[i]<=b){
                    if(((sum)+arr[i])<b){
                        sum=sum+arr[i];
                    }
                    else if(((sum)+arr[i])==b){
                        sum=0;
                        count++;
                    }else{
                        sum=arr[i];
                        count++;
                    }
                }
                else{
                    return false;
                }
            }
            if(sum>0){
                count++;
            }
            if(count<=a){
                return true;
            }else{return false;}
        }
        public static int splitArray(int[] nums, int k) {
            int high=nums[0];
            int low=nums[0];
            for(int i=1;i<=nums.length-1;i++){ 
                if(nums[i]<low){
                    low=nums[i];
                }
                high=high+nums[i];
            }             
            while(low<=high){
                int mid=low + (high-low)/2;
                if(check(nums,k,mid)==true){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            return low;
    }
    public static void main(String[] args) {
        int[] arr1 = {7,2,5,10,8};
        System.out.println(splitArray(arr1,2));
    }
    
    
}
