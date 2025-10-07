public class GCDString {
     public static String gcdOfStrings(String str1, String str2) {
        StringBuilder com= new StringBuilder();
        String big = new String();
        String small= new String();
        boolean x= true;
        if(str1.length()<str2.length()){
            small=str1;
            big=str2;       
        }else{
            small=str2;
            big=str1;  
        }
        int i=0;
        while(i<=small.length()-1){
            if(str1.charAt(i)==str2.charAt(i)){
                com.append(str1.charAt(i));
                i++;              
            }
            else{break;}
        }
        if(com.length()==0){
            return "";
        }else{
            for(int k=0;k<=com.length()-1;k++){
                if(com.charAt(k)==com.charAt(0) && k>0){

                    if(com.substring(0,k).equals(com.substring(k,k+k))){
                        String str=com.substring(0,k);
                        com.setLength(0);
                        com.append(str);

                    }
                }
            }
        }
        for(int j=0;j<=big.length()-1;j++){
            if(j<small.length()){
                if((big.charAt(j)!=com.charAt(j%com.length())) || (small.charAt(j)!=com.charAt(j%com.length()))){
                    System.out.println("condition 1");
                    x=false;
                    break;
                }}else{
                    if(big.charAt(j)!=com.charAt(j%com.length())){
                    System.out.println("condition 2" + i );
                    x=false;
                    break;
                    }
                }           
        }
        if(x==false){
            return "";
        }else return com.toString();     
    }
    public static void main(String[] args){
        System.out.println(gcdOfStrings("ABABAB","ABAB"));
    }    
}
