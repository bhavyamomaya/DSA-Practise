import java.util.Arrays;
public class Mergearray{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=0;
        int right=0;
        while(left<=m-1 && right<=n-1){
        if(nums1[left]>=nums2[right]){
            for(int k=m-1;k>=left;k--){
                nums1[k+1]=nums1[k];         
            }
            nums1[left]=nums2[right];
            left++;
            right++;
        }
        else{
            left++;
        }}
        System.out.println(Arrays.toString(nums1));
        System.out.println(left +"+" +right);  
        for(int i=right;i<=n-1;i++){
            nums1[m+i]=nums2[i];
        }
        System.out.println(Arrays.toString(nums1));
    }
    

    public static void main(String[] args) {
        int[] arr1={2,0};
        int[] arr2={1};
        merge(arr1,1,arr2,1);


        
    }
}
