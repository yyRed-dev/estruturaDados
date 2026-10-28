public class ListaE {

    private int[] v = new int[10];
    private int cont = 0;

    public int getIndex(int elemento) {
        for (int x = 0; x < cont; x++) {
            if (v[x] == elemento) {
                return x;
            }
        }
        return -1;
    }

    public void size() {
        System.out.println("\nTamanho do Vetor: " + cont + ".");
    }

    public void add(int elemento) { //QUEBRADO
        if (cont == v.length || cont > v.length) {
            int tam = v.length * 2;
            int[] v = new int[tam];
            for (int x=0; x<v.length; x++) {
                v[cont+1] = elemento;
            }
            v[cont+1] = elemento;
        } else {
            v[cont] = elemento;
        }
        cont++;
    }

    public void add(int pos, int elemento) {
        for (int aux = cont; aux > pos; aux--) {
            v[aux] = v[aux - 1];
        }
        v[pos] = elemento;
        cont++;
    }

    public void remove(int pos) {
        for (int i = pos; i < cont-1; i++) {
            v[i] = v[i + 1];
        }
        cont--;
    }

    public void remove(Integer elemento) {
        int posicao = getIndex(elemento);
        remove(posicao);
    }

    public void clear() {
        for (int x : v) {
            v[x] = 0;
        }
        cont = 0;
    }

    @Override
    public String toString() {
        System.out.print("Elementos = [ ");

        for (int x = 0; x < cont; x++) {
            System.out.print(v[x] + " ");
        }

        System.out.print("]");
        return "";
    }

}
