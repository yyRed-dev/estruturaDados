public class FilaPrioridadeNO {
    
    NoP primeiro = null;
    NoP ultimo = null;
    int cont = 0;

    public void enqueue(int elemento, int prioridade) {
        NoP novo = new NoP(elemento, prioridade);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.prox = novo;
            novo.ant = ultimo;
            ultimo = novo;
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

        NoP atual = primeiro;
        NoP menor = atual;

        while (atual != null) {
            if (atual.prioridade < menor.prioridade) {
                menor = atual;
            }
            atual = atual.prox;
        }

        if (menor == primeiro) {
            primeiro = primeiro.prox;
            primeiro.ant = null;
        } else if (menor == ultimo) {
            ultimo = ultimo.ant;
            ultimo.prox = null;
        } else {
            menor.prox.ant = menor.ant;
            menor.ant.prox = menor.prox;
        }
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