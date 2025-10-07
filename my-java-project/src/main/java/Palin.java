public class Palin {
        public static boolean isPalindrome(String s) {
          String str=new String();
          for(int i=0;i<=s.length()-1;i++){
            int value =(int)(s.charAt(i));
            if((65<=value && value<=90) || (97<=value && value<=122) || (48<=value && value<=57) ){
                str=str.concat((s.charAt(i)+"").toLowerCase());
            }
          }
          System.out.println(str);
          boolean x=true;
           for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                x=x && true;
            }
            else{
                x=x&&false;
            }
           }
          return x;  
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(" "));
    }
    
}
