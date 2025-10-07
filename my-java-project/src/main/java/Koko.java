class koko {
    public static boolean check(int[] arr,int a,int b){
    int count = 1; 
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > b) {
            return false; 
        }
        if (sum + arr[i] > b) {
            count++;
            sum = arr[i]; 
        } else {
            sum += arr[i];
        }
    }
    return count <= a;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int high=weights[0];
        for(int i=1;i<=weights.length-1;i++){
            high=high+weights[i];
        }
        int low=1;
        while(low<=high){
            System.out.println("count");
            int mid=low+(high-low)/2;
            System.out.println(mid);
            if(check(weights,days,mid)==true){
                high=mid-1;
            }else{
                low=mid+1;
                System.out.println("else count");
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr= {3,2,2,4,1,4};
        System.out.println(shipWithinDays(arr,3));
    }
}