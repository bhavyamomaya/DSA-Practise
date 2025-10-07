import java.util.Stack;
public class ReverseWords {
      public static String reverseWords(String s) {
        Stack<String> st = new Stack<String>();
        String temp = new String();
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)==' '){
                System.out.println(temp);
                if(temp.length()!=0){
                    st.add(temp);
                    temp="";
                }
                
            }
            else{
                temp = temp.concat(s.charAt(i)+"");
            }          
        }
        if(temp.length()!=0){
            st.add(temp);
        }

        String out = new String();

        while(!st.isEmpty()){
            out=out.concat(st.pop()+" ");
        }
        out=out.substring(0,out.length()-1);
        return out;       
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        
    }
    
}

