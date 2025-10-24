public class lemonade {
    public static boolean lemonadeChange(int[] bills) {
        int fcount=0;
        int tcount=0;

        for(int i=0;i<=bills.length-1;i++){
            if(bills[i]==5){
                fcount++;
                System.out.println("case 5");
            }else{
                if(bills[i]==10){
                    if(fcount>0){
                        fcount--;
                        tcount++;
                    }else{
                        return false;
                    }
                    System.out.println(" case 10");
                }
            else{
                System.out.println("case 20");
                if(tcount>=1 && fcount>=1){
                    tcount--;
                    fcount--;
                }else{
                    if(fcount>=3){
                        fcount=fcount-3;
                    }
                    else{
                        return false;
                    }
                }
            }
        }}
    return true;    
    }

    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        System.out.println(lemonadeChange(bills));
    }
}