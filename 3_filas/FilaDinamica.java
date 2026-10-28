public class FilaDinamica {
    
    Node primeiro = null;
    Node ultimo = null;
    int cont = 0;

    public void enqueue(int elemento) {
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
        Node atual = primeiro;
        String resultado = "[ ";

        while (atual != null) {
            resultado += atual.valor + " ";
            atual = atual.prox;
        }
        resultado += "]";
        return resultado;
    }

}