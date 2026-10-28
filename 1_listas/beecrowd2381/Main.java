import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) throws IOException {
        sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Lista alunos = new Lista();

        for(int i=0; i<n; i++) {
            String nomeAluno = sc.nextLine();
            alunos.add(nomeAluno);
        }
        // alunos.ordenar();
        alunos.escolherAluno(k);
        
    }
}