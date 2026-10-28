public class PilhaE {
    
    int[] pilha;
    int topo;

    public PilhaE(int tamanho) {
        pilha = new int[tamanho];
        topo = -1;
    }

    public void push(int elemento) {
        topo++;
        pilha[topo] = elemento;
    }

    public void pop() {
        topo--;
    }

    public boolean empty() {
        if ( size() == 0 ) {
            return true;
        }
        return false;
    }

    public int last() {
        return pilha[topo];
    }

    public int size() {
        return topo+1;
    }

    public void destruct() {
        topo = -1;
    }

    @Override
    public String toString() {
        String resultado = "[ ";
        for (int x=0; x<=topo; x++) {
            resultado += pilha[x] + " ";
        }
        resultado += " ]";
        return resultado;
    }

}