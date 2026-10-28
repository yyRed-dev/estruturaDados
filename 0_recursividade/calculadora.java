import java.math.BigInteger;
public class calculadora {

    // calcula o fatorial de um numero
    public BigInteger fatorial(int n) {
        if (n==1 || n==0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply( fatorial(n-1) );
    }

    // calcula e mostra o elemento da posicao inserida na sequencia de fibonacci
    public int fib(int n) {
        if (n<2) {

            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    //
    public int doisElevado(int n) {
        if (n==0) {
            return 1;
        }
        if (n==1) {
            return 2;
        }
        return 2*doisElevado(n-1);
    }

    public int max(int[] V, int tamanho) {
        if (tamanho == 1) {
            return V[0];
        }
        int maior = max(V, tamanho-1);

        if (V[tamanho-1] > maior) {
            return V[tamanho-1];
        } else {
            return maior;
        }
    }

}