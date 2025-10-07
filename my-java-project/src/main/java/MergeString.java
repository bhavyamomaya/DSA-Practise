public class MergeString {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder out = new StringBuilder();
        int ind1=0;
        int ind2=0;
        int count=0;
        while(ind1<=word1.length()-1 && ind2<=word2.length()-1){
            if(count%2 ==0){
                out.append(word1.charAt(ind1));
                ind1++;
            }else{
                out.append(word2.charAt(ind2));
                ind2++;
            }
            count++;
        }     
        if(word1.length()>word2.length()){
                out.append(word1.substring(ind1,word1.length()));
            }else{
                out.append(word2.substring(ind2,word2.length()));
            }
        return out.toString();
    }
    public static void main(String[] args){
        System.out.println(mergeAlternately("abcdeee","pqrs"));
    }


    
}
