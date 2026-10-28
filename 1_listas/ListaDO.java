public class ListaDO {
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
        } else if (novo.dado < primeiro.dado) {
            primeiro.ant = novo;
            novo.prox = primeiro;
            primeiro = novo;
        } else if (novo.dado >= ultimo.dado) {
            ultimo.prox = novo;
            novo.ant = ultimo;
            ultimo = novo;
        } else {
            Node atual = primeiro;
            while (atual != null && novo.dado >= atual.dado) {
                atual = atual.prox;
            }
            novo.ant = atual.ant;
            atual.ant.prox = novo;
            atual.ant = novo;
            novo.prox = atual;
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
