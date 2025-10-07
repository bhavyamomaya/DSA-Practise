import java.util.*;
public class fibon{
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int Zeroocc(boolean[] abc){
        int tempcount=0;
        int count=0; 
        for(int i=0;i<=abc.length-1;i++){
            if(abc[i]==false){
                tempcount++;
            }
            else{
                if(tempcount>count){
                    count=tempcount;
                }
                tempcount=0;
            }
        }
        return count;
    } 
    public static int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        boolean[] arr= new boolean[eventTime];
            for(int i=0;i<=eventTime-1;i++){
                arr[i]=false;
            }
            for(int i=0;i<startTime.length;i++){
                int tempdiff=endTime[i]-startTime[i];
                for(int j=0;j<=tempdiff-1;j++){
                    arr[startTime[i]+j]=true;
                }
            }
            System.out.println(Arrays.toString(arr));
            return 0;     
        } 
    public static void main(String[] args){ 
        int[] arr1 ={1,3};
        int[] arr2={2,5};
        maxFreeTime(5,arr1,arr2);       
    }
}
