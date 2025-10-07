public class FancyString {
     public static String makeFancyString(String s) {
        int count=0;
        StringBuilder out = new StringBuilder();
        out.append(s.charAt(0));
        for(int i=1;i<=s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                }
            else{
                count=0;
                }
            if(count<2){
                out.append(s.charAt(i));
            }  
        }
        return out.toString();             
    }

    public static void main(String[] args) {
        System.out.println(makeFancyString("Leeeetcode"));
    }  
}
