public class Node {
    int valor;
    Node prox;
    Node ant;

    public Node (int valor) {
        this.valor = valor;
        this.prox = null;
        this.ant = null;
    }
}