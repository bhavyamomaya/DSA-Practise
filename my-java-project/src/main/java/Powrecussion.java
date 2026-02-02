public  class Powrecussion {
    public static  double myPow(double x, int n) {
        double xd=x;
         

        System.out.println(x );
        return myPow(x*x,n-1);
}
    public static void main(String[] args) {
        
        System.out.println(myPow(2,10));
    }


}
