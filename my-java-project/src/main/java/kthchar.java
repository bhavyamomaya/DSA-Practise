public class kthchar{

    public static char kthCharacter(int k) {
        return helper("a",k).charAt(k-1);    
    }
        
    public static String helper(String s,int m) {
        if(m<1){
            return s;
        }
        int k=s.length();
           for(int i=0;i<=k-1;i++) {
            String x=Character.toString((char)(s.charAt(i)+1));
            s=s.concat(x); 
           }
         return helper(s,m-1);
        }
    
    public static void main(String[] args) {
        System.out.println(kthCharacter(5));
    }
    
}