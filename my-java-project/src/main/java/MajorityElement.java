import java.util.Hashtable;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Hashtable<Integer,Integer> ht=new Hashtable<Integer,Integer>();
        for(int i=0;i<=nums.length-1;i++){
            if(ht.containsKey(nums[i])){
                ht.put(nums[i],ht.get(nums[i])+1);
            }
            else{
                ht.put(nums[i], 1);
            }
        }
        System.out.println(ht);
        for (Map.Entry<Integer, Integer> entry : ht.entrySet()) {
            if (entry.getValue()>(nums.length/2)) {
                return entry.getKey();      
            }
        }
        System.out.println(ht);
        return 0;

        
    }
    public static void main(String[] args) {
        int[] arr1={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr1));
    }
    
}
