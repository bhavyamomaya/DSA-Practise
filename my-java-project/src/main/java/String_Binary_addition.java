import java.util.*;
class String_Binary_addition {
    public static String addBinary(String a, String b) {

        String output = "";
        String larger,smaller;
        if(a.length()>=b.length()){
            larger= a;
            smaller = b;
        }
        else {
            larger= b;
            smaller = a;
        }

        int diff=larger.length()-smaller.length();
        int carry=0;
        for(int i=larger.length()-1;i>=0;i--){
           if(i>=(larger.length()-smaller.length())){ 
            int tempsum=(int)((smaller.charAt(i-diff))-'0')+(int)(larger.charAt(i)-'0');
            if(tempsum+carry==0){
                output=output.concat("0");
                carry=0;
                 System.out.println("case0");
            }
            else if(tempsum+carry==1){
                output=output.concat("1");
                carry=0;   
                 System.out.println("case1");    
            }
            else if(tempsum+carry==2){
                output=output.concat("0");
                carry=1;
                 System.out.println("case2");
            }
            else if(tempsum+carry==3){
                output=output.concat("1");
                carry=1;
                 System.out.println("case3");
            }}
            else{
                if(carry==0){
                    output=output.concat(larger.substring(i, i+1));
                    carry=0;
                    System.out.println("entering else");
                }
                else{
                    if(larger.charAt(i)=='0'){
                        output=output.concat("1");
                        carry=0;
                        System.out.println("entering else");
                    }
                    else{
                        output=output.concat("0");
                        carry=1;
                        System.out.println("entering else");
                    }

                }
                
            }
        }
        if(carry==1){
            output=output.concat("1");
        }
        output = new StringBuilder(output).reverse().toString();
        return output;     
    } 
    public static void main(String[] args){        
        System.out.println(addBinary("111111","1"));
    }

}
