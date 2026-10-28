import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {
        sc = new Scanner(System.in);

        int n = sc.nextInt();
        FilaDinamica fila = new FilaDinamica();

        for (int i=0; i<n; i++) {
            int id = sc.nextInt();
            fila.enqueue(id);
        }

        FilaDinamica aux = new FilaDinamica();
        int m = sc.nextInt();
        for (int j=0; j<m; j++) {
            int extra = sc.nextInt();
            aux.enqueue(extra);
        }

        System.out.println(fila);
        System.out.println(aux);

    }
}