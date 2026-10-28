import java.util.Scanner;

public class Main {

    static Scanner sc;
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        ListaE listaE = new ListaE();
        ListaD listaD = new ListaD();
        ListaDO listaDO = new ListaDO();

        //TESTES DA LISTA ESTATICA
        System.out.println("\nLISTA ESTATICA!\n");
        listaE.add(0);
        listaE.add(1);
        listaE.add(2);
        listaE.add(3);
        listaE.add(4);
        listaE.add(5);
        listaE.add(6);
        listaE.add(7);
        listaE.add(8);
        listaE.add(9);
        System.out.println(listaE);
        System.out.println( listaE.getIndex(6) );
        listaE.remove(2);
        System.out.println(listaE);
        listaE.add(10);
        System.out.println(listaE);

        //TESTES DA LISTA DINAMICA
        System.out.println("\nLISTA DINAMICA!\n");
        listaD.add(3);
        listaD.add(5);
        listaD.add(7);
        listaD.add(9);
        listaD.add(11);
        listaD.add(13);
        System.out.println(listaD);
        System.out.println("Tamanho da Lista: " +listaD.size() );
        System.out.println("");
        System.out.println(listaD);
        System.out.println("Tamanho da Lista: " +listaD.size() );
        System.out.println( listaD.contains(5) );

        //TESTES DA LISTA ORDENADA
        System.out.println("\nLISTA ORDENADA!\n");
        listaDO.add(5);
        System.out.println( listaDO );
        listaDO.add(1);
        System.out.println( listaDO );
        listaDO.add(7);
        System.out.println( listaDO );

    }
}