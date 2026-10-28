public class ListaD {
    private Node primeiro = null;
    private Node ultimo = null;
    private int cont;

    public int size() {
        return cont;
    }

    public void clear() {
        this.primeiro = null;
        this.ultimo = null;
        cont = 0;
    }

    public void add(int elemento) {
        Node novo = new Node(elemento);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.prox = novo;
            ultimo = novo;
        }
        cont++;
    }

    public boolean contains(int elemento) {
        Node atual = primeiro;
        while(atual != null) {
            if ( atual.dado == elemento ) {
                return true;
            }
            atual = atual.prox;
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.primeiro == null && this.ultimo == null) {
            return "[ Lista Vazia ]";
        } else {
            String retorno = "[ ";
            Node atual = primeiro;

            for (int i = 0; i < cont; i++) {
                retorno += atual.dado + " ";
                atual = atual.prox;
            }
            retorno += "]";
            return retorno;
        }
    }

}
