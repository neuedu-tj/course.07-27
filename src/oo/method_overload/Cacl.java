package oo.method_overload;

public class Cacl {

    public int add( int x , int y ) {
        return x + y;
    }

    public int add( int x , int y , int z ) {
        return x + y+ z;
    }

    public double add(double x , double y ) {
        return x + y ;
    }

    public String add(String x  , int y ) {
        return x + y;
    }

    public String add( int y  , String x) {
        return x + y;
    }


}
