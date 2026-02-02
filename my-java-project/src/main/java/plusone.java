
import java.util.Arrays;

public class plusone{
        public static int[] plusOne(int[] digits) {
        int[] abc = digits.clone();
        if(digits[digits.length-1]<9){
            abc[abc.length-1]=abc[abc.length-1]+1;            
        }else{
            int i=digits.length-1;
            while(digits[i]==9 && i>0){
                i--;
            }
            if(i>0){
                abc[i]=abc[i]+1;
                for(int j=i+1;j<=abc.length-1;j++){
                    abc[j]=0;
                }
            }
            else{
                int[] lmn = new int[digits.length+1];
                lmn[0]=1;
                return lmn;      
            }
        }
        System.out.println(Arrays.toString(abc));
        return abc;
    }
    public static void main(String[] args){
        int[] xyz={4,7,9,9,9,9,9};
        System.out.println(plusOne(xyz));
    }
}