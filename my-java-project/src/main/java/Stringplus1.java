public class Stringplus1{
    public static int maxArea(int[] height) {
        int temparea=0;
        int area=0;

        for(int i=0;i<=height.length-2;i++){
            for(int j=i+1;j<=height.length-1;j++){
                temparea = (j-i) * ((height[i] < height[j]) ? height[i] : height[j]);
                if(temparea>area){
                    area=temparea;
                } 
                temparea=0;
            }
        }
        return area;
        }
    public static void main(String[] args) {
        int[] abc={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(abc));      
    }
}