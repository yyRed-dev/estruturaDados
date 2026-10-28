public class FilaPrioridade {
    
    NoP primeiro = null;
    NoP ultimo = null;
    int cont = 0;

    public void enqueue(int elemento, int prioridade) {
        NoP novo = new NoP(elemento, prioridade);

        if (primeiro == null) { // add 1 pos
            primeiro = novo;
            ultimo = novo;
        } else if (novo.prioridade < primeiro.prioridade) { // add 
            primeiro.ant = novo;
            novo.prox = primeiro;
            primeiro = novo;
        } else if (novo.prioridade >= ultimo.prioridade) { // add no final
            ultimo.prox = novo;
            novo.ant = ultimo;
            ultimo = novo;
        } else {                                          // procura local para adicionar
            NoP atual = primeiro;
            while (atual != null && novo.prioridade >= atual.prioridade) {
                atual = atual.prox;
            }
            novo.ant = atual.ant;
            atual.ant.prox = novo;
            atual.ant = novo;
            novo.prox = atual;
        }
        cont++;
    }

    public void dequeue() {
        if (cont == 0) {
            System.out.println("Fila sem elementos.");
            return;
        }
        
        if (cont == 1) { //fila com so 1 elemento
            clear();
            return;
        }

        primeiro = primeiro.prox;
        primeiro.ant = null;
        cont--;
    }

    public int size() {
        return cont;
    }

    public void clear() {
        primeiro = null;
        ultimo = null;
        cont = 0;
    }

    public boolean empty() {
        if (cont != 0) {
            return true;
        }
        return false;
    }

    public int peek() {
        return primeiro.valor;
    }

    @Override
    public String toString() {
        NoP atual = primeiro;
        String resultado = "[ ";

        while (atual != null) {
            resultado += atual.valor + " (" + atual.prioridade + ") ";
            atual = atual.prox;
        }
        resultado += "]";
        return resultado;
    }

}