// 1488. Avoid Flood in The City
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class flood {
    public static int[] avoidFlood(int[] rains) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int[] out = new int[rains.length];
        ArrayList<Integer> zarr = new ArrayList<>();
        for(int i=0;i<=rains.length-1;i++){
            if(hm.containsKey(rains[i])){
                if(zarr.size()==0){
                    int[] x= {};
                    return x;
                }
            else{
                 for(int j=0;j<=zarr.size()-1;j++){
                    if(zarr.get(j)>hm.get(rains[i])){
                        out[zarr.get(j)]=rains[i];
                        zarr.remove(j);
                        out[i]=-1;
                        hm.put(rains[i],i);
                        break;
                    }
                 }
            }
            }else{
                if(rains[i]==0){
                    if(hm.size()>0){
                        zarr.add(i);
                    }
                }else{
                    hm.put(rains[i],i);
                    out[i]=-1;
                }
            }
        }
        for(int i=0;i<=zarr.size()-1;i++){
            out[zarr.get(i)]=1;
        }      
        System.out.println(Arrays.toString(out));   
         return out;
    }
    public static void main(String[] args) {
        int[] x={1,0,2,0,3,0,2,0,0,0,1,2,3};
        avoidFlood(x);      
    }

}