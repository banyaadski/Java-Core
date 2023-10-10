package org.example;


import java.util.Date;


public class Main {
    public static void main(String[] args) throws Exception {
        int res = MathClass.add(2,4);
        System.out.println(DateClss.Format(res));
        res = MathClass.mult(2,4);
        System.out.println(DateClss.Format(res));
        res = MathClass.div(0,4);
        System.out.println(DateClss.Format(res));
        res = MathClass.div(2,4);
        System.out.println(DateClss.Format(res));

    }




}