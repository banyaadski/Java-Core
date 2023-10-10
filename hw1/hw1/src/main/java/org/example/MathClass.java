package org.example;

public class MathClass {
    public static int add(int a, int b){
        return a+b;
    }
    public static int mult(int a, int b){
        return a*b;
    }
    public static int div(int a, int b) throws Exception {
        if (a==0){
            throw new ArithmeticException("На ноль делить нельзя");
        }else if (a<0){
            throw new Exception("Введите число больше 0");
        }else {
            return a/b;
        }

    }
}
