import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {
        sc = new Scanner(System.in);

        int n;
        FilaDinamica fila = new FilaDinamica();

        while (true) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            }

            String descartadas = "Discarded cards: ";

            for (int i=1; i<n+1; i++) {
                fila.enqueue(i);
            }

            while ( fila.size() > 1 ) {
                if ( fila.size() > 2 ) {
                    descartadas += fila.peek() + ", ";
                } else {
                    descartadas += fila.peek();
                }

                fila.dequeue();
                fila.enqueue(fila.peek());
                fila.dequeue();
            }
            System.out.println(descartadas);
            System.out.println("Remaining card: " + fila.peek());
            fila.clear();
        }

    }
}