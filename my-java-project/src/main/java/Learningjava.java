enum bhavya {
    hello,hii,adios,bye;
}

class Calc{
    public int add(int a,int b){
        return a+b;
    }
}

class Advcalc extends Calc{
    public int avg(int a,int b){
        return add(a,b)/2;
    }
}

public class Learningjava {
    public static void main(String[] args) {
        Advcalc x= new Advcalc();
        System.out.println(x.avg(3,5));
        System.out.println((bhavya.adios).ordinal());
    }

    
}
