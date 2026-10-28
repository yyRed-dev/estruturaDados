# Pilhas
Repositório para estudos e testes de pilhas (estáticas e dinâmicas) durante as aulas de Estrutura de Dados.

### Classes
- PilhaE: Pilha estática, guarda os elementos em um vetor de tamanho definido no construtor.
- PilhaD: Pilha dinâmica, usa nós (`Node`) e guarda apenas o topo.
- Node: Nó usado pela pilha dinâmica (valor e anterior).
- Main: Verifica se os parênteses de uma expressão estão balanceados, imprimindo "correct" ou "incorrect".

### Métodos
- push: Adiciona um elemento no topo da pilha.
- pop: Remove o elemento do topo da pilha.
- last: Mostra o elemento do topo.
- empty: Verifica se a pilha está vazia.
- size: Mostra a quantidade de elementos.
- destruct: Esvazia a pilha.