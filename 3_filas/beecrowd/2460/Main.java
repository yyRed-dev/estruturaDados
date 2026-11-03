import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {
        sc = new Scanner(System.in);

        FilaDinamica fila = new FilaDinamica();
        int n = sc.nextInt();

        for (int i =0; i<n; i++) {
            fila.enqueue( sc.nextInt() );
        }

        System.out.println(fila);

        int m = sc.nextInt();
        FilaDinamica deixaram = new FilaDinamica();

        for (int j=0; j<m;j++) {
            deixaram.enqueue( sc.nextInt() );
        }

        FilaDinamica filaFinal = new FilaDinamica();
        while (fila.size() > 0) {
            int pessoa = fila.peek();
            fila.dequeue();

            if (!deixaram.search(pessoa)) {
                filaFinal.enqueue(pessoa);
            }
        }
        System.out.println(filaFinal);

    }
}