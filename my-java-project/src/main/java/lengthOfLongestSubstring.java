import java.util.HashSet;

public class lengthOfLongestSubstring{
    public static int lengthOfLongestSubstring1(String s) {
        int count=0;      
        HashSet<Character> set= new HashSet<>();
        int tempcount=0;   
        int trigger=0;
        for(int i=0;i<=s.length()-1+trigger;i++){
            if ( !(set.contains(s.charAt(i-trigger)))) {              
                if(set.isEmpty() && i>0){
                    int x=1;
                    while(s.charAt(i-trigger)!=s.charAt(i-trigger-x)){
                        set.add(s.charAt(i-trigger-x));
                        tempcount++;
                        x++;
                    }
                }            
                set.add(s.charAt(i-trigger));
                tempcount++;        
            } else {
                if(tempcount>=count){
                    count=tempcount;            
                }
                tempcount=0;
                set.clear();
                trigger++;
                
            }      
     }
        if(tempcount>=count){
        System.out.println(tempcount);
        return tempcount;
        }
        else{
            return count; 
        }
}
    public static void main(String[] args) {
        lengthOfLongestSubstring1("dvdf") ;         
    }
}

