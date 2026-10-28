public class Lista {
    Node primeiro;
    Node ultimo;
    
    public void add(String nome) {
        Node novo = new Node(nome);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
            return;
        }

        Node atual = primeiro;
        while(atual != null) {
            if (atual.proximo == null) {
                atual.proximo = novo;
                ultimo = novo;
                return;
            }
            atual = atual.proximo;
        }

    }

    public void escolherAluno(int num) {
        Node atual = primeiro;

        for (int i=0; i<num; i++) {
            atual = atual.proximo;
        }
        System.out.println(atual.nome);
    }
    
    @Override
    public String toString() {
        Node atual = primeiro;
        String resultado = "[ ";
        while(atual != null) {
            resultado += atual.nome + " ";
            atual = atual.proximo;
        }
        resultado += "]";
        return resultado;
    }   
}