import java.util.Stack;

public class ArrayDecending {
        public static  int maximumPossibleSize(int[] nums) {
            int pretotal=0;
            int count =0;
            for(int i=0;i<=nums.length-2;i++){
                if(nums[i]<=nums[i+1]){
                    pretotal=nums[i];
                }
                else{
                    for(int j=i;j<=nums.length-1;j++){

                    }
                }
            }


        
    }

    public static void main(String[] args) {
        int[] arr1 = {4,2,5,3,5};
        System.out.println(maximumPossibleSize(arr1));
    }


    
}
