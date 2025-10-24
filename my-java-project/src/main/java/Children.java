import java.util.Arrays;
public class Children {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int right=0;
        int left=0;

        while(left<=s.length){
            if(g[right]<=s[left]){
                right++;
            }
            left++;
        }
        return right;     
    }
    public static void main(String[] args) {
        int[] g={1,2,3};
        int[] s={1,1};
        System.out.println(findContentChildren(g,s));
    }   
}