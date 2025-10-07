import java.util.Hashtable;
import java.util.Map;

public class MissingNumber {
     public static int missingNumber(int[] nums) {
       int answer=0;
        Hashtable<Integer,Integer> table=new Hashtable<Integer,Integer>();
        for(int i=0;i<=nums.length;i++){     
            table.put(i, 0);
        }
        for(int i=0;i<=nums.length-1;i++){     
            if(table.containsKey(nums[i])){
                table.put(nums[i],1);
            }
        }        
        for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
            if (entry.getValue().equals(0)) {
                answer=entry.getKey();
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr1={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr1));

    }
    

    
}