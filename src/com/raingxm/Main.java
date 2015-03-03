package com.raingxm;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> primes = new ArrayList<Integer>();

    public static void generate(int n) {
        int start = 2;
        while(true) {
            if(start > n) {
                break;
            }
            n =divideNum(n, start);
            start++;
        }
    }

    public static void showPrimes() {
        for(Integer prime: primes) {
            System.out.print(prime + " ");
        }
        System.out.println();
    }

    private static int divideNum(int n, int num) {
        if(n % num == 0) {
            while(n % num == 0) n /= num;
            primes.add(num);
        }
        return n;
    }

    public static void main(String[] args) {
        generate(30);
        showPrimes();
    }
}
