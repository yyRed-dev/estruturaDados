public class FilaEstatica {
    private Object[] v = new Object[100];
    private int ini = 0;
    private int fim = -1;

    public void enqueue(Object elemento) {
        fim++;
        v[fim] = elemento;
    }

    public void dequeue() {
        if ( empty() ) {
            System.out.println("Fila vazia!");
            return;
        }
        ini++;
    }

    public boolean empty() {
        return ini > fim;
    }

    public Object peek() {
        return v[ini];
    }

    public int size() {
        return fim - ini + 1;
    }

    public void clear() {
        this.ini = 0;
        this.fim = -1;
    }

    @Override
    public String toString() {
        String resultado = "[ ";
        for (int i=ini; i<=fim; i++) {
            resultado += v[i] + " ";
        }
        resultado += "]";
        return resultado;
    }

}