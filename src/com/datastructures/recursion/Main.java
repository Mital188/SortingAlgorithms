package com.datastructures.recursion;

public class Main {
    public static void main(String[] args){
        int num =4;
        System.out.print("Factorial : "+ factorial(num));
    }

    public static int factorial(int num){
        if(num<2)
            return 1;
        return num*factorial(num-1);
    }
}
