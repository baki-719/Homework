package main.Pro1;

/**
 * Created by ge62 on 2016-10-04.
 */
public class Fibo {
    private int n;

    public void setN(int n) {
        this.n = n;
    }

    public int fibonacci(int n) {

        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public void print() {
        for (int i = 0; i <= n; i++) {
            System.out.println("Fibonacci of " + i + ":" + fibonacci(i));
        }
    }
}