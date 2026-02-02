class Candy {
    public static int candy(int[] ratings) {
        int sum=1;
        int prev=1;

        for(int i=1;i<=ratings.length-1;i++){
            if(ratings[i]>ratings[i-1]){
                if(ratings[i]>ratings[i+1]){
                    sum=sum+

                }else{
                    sum=sum+prev+1;
                    prev= prev+1;
                }              
            }
            else{
                if(ratings[i]>ratings[i+1]){

                }else{

                } 

            }
        }








        return sum;
    }
    public static void main(String[] args) {
        int[] arr1={1,3,2,1};
        System.out.println(candy(arr1));

    }

}
