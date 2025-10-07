import java.util.HashMap;
import java.util.Map;

public class LuckyInteger {
        public static int findLucky(int[] arr) {
            HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
            for(int i=0;i<=arr.length-1;i++){
                if(!hm.containsKey(arr[i])){                   
                    hm.put(arr[i],1);
                }             
                else{
                    hm.replace(arr[i],hm.get(arr[i]),hm.get(arr[i])+1);
                }
            }
            int x=0;
            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                 if (entry.getKey().equals(entry.getValue())){
                    if(entry.getKey()>x){
                        x=entry.getKey();
                    }
                 }
                 else{
                    x=-1;
                 }         
            }
            System.out.println(x);
            return x;
                
    }
    public static void main(String[] args) {
        int[] abc={1,2,2,2,3,3,4,4,4};
        findLucky(abc);
    }
    
}
