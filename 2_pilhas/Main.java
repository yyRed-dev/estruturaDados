import java.util.Scanner;

public class Main {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            PilhaD pilha = new PilhaD();
            String entrada = sc.nextLine();
            boolean teste = true;

            for (int i = 0; i < entrada.length(); i++) {
                if (entrada.charAt(i) == '(') {
                    pilha.push(1);
                } else if (entrada.charAt(i) == ')') {
                    if (!pilha.empty()) {
                        pilha.pop();
                    } else {
                        teste = false;
                        break;
                    }
                }
            }

            if (pilha.size() != 0) {
                teste = false;
            }

            System.out.println(teste ? "correct" : "incorrect");
        }
        
    }
}