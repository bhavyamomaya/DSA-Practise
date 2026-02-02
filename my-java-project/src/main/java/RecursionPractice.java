import java.util.Arrays;
public class RecursionPractice {

    public static int[] rec(int[] n,int count){
        if(count>(n.length/2)-1){
            return n ;
        }

        int a=n[count];
        n[count]=n[n.length-1-count];
        n[n.length-1-count]=a;

        return rec(n,count+1);
        
    }
    public static void main(String[] args) {
        int[] abc = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rec(abc,0)));
    }
    
}
