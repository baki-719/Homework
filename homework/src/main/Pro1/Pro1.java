package main.Pro1;

import java.util.Scanner;



public class Pro1 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        Fibo fibo = new Fibo();

        while (true) {
            n = sc.nextInt();
            fibo.setN(n);
            fibo.fibonacci(n);
            fibo.print();
        }

    }
}