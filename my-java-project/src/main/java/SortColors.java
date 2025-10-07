import java.util.Arrays;        
public class SortColors{
    public static void sortColors(int[] nums) {
        int a=0;
        int c=0;
        while(a<=2){
            for(int i=0;i<=nums.length-1;i++){
                if(nums[i]==a){
                    int temp=nums[i];
                    nums[i]=nums[c];
                    nums[c]=temp;
                    c++;
                }
            }
            a++;
        }     
    }
    public static void main(String[] arg){
        int[] arr= {2,0,2,1,1,0};
        sortColors(arr);
    }

}