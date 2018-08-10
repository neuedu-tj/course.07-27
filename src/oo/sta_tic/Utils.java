package oo.sta_tic;

import lombok.Data;

@Data
public class Utils {

    private int id = 1 ;
    public static String NAME = "TOM";

    public static int add( int x , int y) {
        // Math
        return x + y;
    }

}
