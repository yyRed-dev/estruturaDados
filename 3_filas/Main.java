import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main (String[] args) throws IOException {
        // sc = new Scanner(System.in);

        FilaPrioridade fila = new FilaPrioridade();

        fila.enqueue(15,1);
        fila.enqueue(66,0);
        fila.enqueue(38,2);
        fila.enqueue(87,2);
        fila.enqueue(11,1);

        System.out.println(fila);

    }
}