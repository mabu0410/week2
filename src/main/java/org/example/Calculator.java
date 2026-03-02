package org.example;

public class Calculator {

    public int tong(int a, int b){
        return a + b;

    }

    // tinh giai thua
    public long f(int n){
        if(n < 0){
            System.out.println("n >= 0");
        }

        long result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }
}
