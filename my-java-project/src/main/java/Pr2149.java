import java.util.Arrays;
public class Pr2149 {
    public static int[] rearrangeArray(int[] nums) {
        int[] abc= new int[nums.length];
        int odd=1;
        int even=0;
        int count=0;
        while(count<=nums.length-1){
            if(nums[count]<0){
                abc[odd]=nums[count]; 
                odd=odd+2;        
            }
            else{
                abc[even]=nums[count];
                even=even+2;
            }
            count++;
        }
        return abc;       
    }
    public static void main(String[] args) {
        int[] arr1 ={28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        System.out.println(Arrays.toString(rearrangeArray(arr1)));
    }
    
}
