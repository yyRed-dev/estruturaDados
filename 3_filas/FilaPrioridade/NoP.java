public class NoP {
    int valor;
    NoP prox;
    NoP ant;
    int prioridade;

    public NoP(int valor, int prioridade) {
        this.valor = valor;
        this.prioridade = prioridade;
        this.prox = null;
        this.ant = null;
    }
}