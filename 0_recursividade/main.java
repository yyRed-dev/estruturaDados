import java.io.IOException;
import java.util.Scanner;

public class main {
    static Scanner sc;
    public static void main(String[] args) throws IOException {

        sc = new Scanner(System.in);

        int valor = sc.nextInt();

        System.out.println(fib(valor) );

    }

    public static int fib(int n) {
        if (n<2) {

            return n;
        }
        return fib(n-1)+fib(n-2);
    }

}