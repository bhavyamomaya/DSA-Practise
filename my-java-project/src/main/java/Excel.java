import java.util.*;
public class Excel {
    public static String getHint(String secret, String guess) {
        int bulls=0;int cows=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        String str = "";
        for(int i=0;i<=secret.length()-1;i++){
            if(hm.containsKey(secret.charAt(i))){
                hm.put(secret.charAt(i), hm.get(secret.charAt(i))+1);        
            }else{
                hm.put(secret.charAt(i),1);
            }
        }
        System.out.println(hm);
        for(int i=0;i<=guess.length()-1;i++){
            if(guess.charAt(i)==secret.charAt(i)){
                bulls++;
            }
                if(hm.containsKey(guess.charAt(i))){
                    if(hm.get(guess.charAt(i))>1){
                    hm.put(guess.charAt(i),hm.get(guess.charAt(i))-1);
                }else{
                    hm.remove(guess.charAt(i));
                }
                }
            }
        str=str.concat(bulls + "A" +cows+"B");
        return str;
    }
    public static void main(String[] args) {
        System.out.println(getHint("1122","1222"));        
    }
}
