public class MatrixSearch {
     public static boolean searchMatrix(int[][] matrix, int target) {
     int low =0;
     int high =(matrix.length*matrix[0].length);
     while(low<=high){
        int mid=low + (high-low)/2;
        int m = mid/matrix[0].length;
        int n=0;
        if(mid%matrix[0].length==0){
            if(m>0){
            m--;}
            n=matrix[0].length-1;
        }else{ n =(mid%matrix[0].length)-1;}
        System.out.println(matrix[m][n]);
        if(matrix[m][n]==target){
            return true;
        }
        if(matrix[m][n]>target){
            high=mid-1;
        }else{
            low=mid+1;
        }  
     }
    return false;
    }

    public static void main(String[] args) {
        int i=3;
       String s = new String("abcde");
       String goal= new String("cdeab");
       System.out.println(((s.substring(0,s.length()-i)==(goal.substring(i,s.length())))));


    }
    
}
