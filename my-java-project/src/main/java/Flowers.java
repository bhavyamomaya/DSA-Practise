public class Flowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int zeroc=0;
        boolean onefound =false;
        for(int i=0;i<=flowerbed.length-1;i++){  
            if(flowerbed[i]==0){
                zeroc++;
            }
            else{
                if(onefound==false){
                int x= (zeroc)/2;
                n=n-x;
                zeroc=0;  
                }else{
                int x= (zeroc-1)/2;
                n=n-x;
                zeroc=0;
              }     
                onefound=true;            
            }
        }
        if(zeroc>=2){
            n=n-(zeroc/2);
        }
        if(n<=0){
            return true;
        }
        else{return false;}
    }
    public static void main(String[] args) {
        int[] arr={0,0,1,0,1};
        System.out.println(canPlaceFlowers(arr, 1   ));
        
    }
    
}
