# Listas
Repositório para estudos e testes de listas (estáticas e dinâmicas) durante as aulas de Estrutura de Dados.

### Classes
- ListaE: Lista estática, guarda os elementos em um vetor.
- ListaD: Lista dinâmica encadeada, usa nós (`Node`) com referência para o próximo.
- ListaDO: Lista dinâmica duplamente encadeada e ordenada, insere cada elemento já na posição correta.
- Node: Nó usado pelas listas dinâmicas (dado, próximo e anterior).
- Sistema: Menu para manipular as listas pelo terminal (em andamento).
- Main: Testes das três listas.

### Métodos
- add: Adiciona um elemento na lista (na ListaE também é possível escolher a posição).
- remove: Remove um elemento pela posição ou pelo valor (ListaE).
- getIndex: Retorna a posição de um elemento, ou -1 se não existir (ListaE).
- contains: Verifica se um elemento está na lista (ListaD e ListaDO).
- size: Mostra a quantidade de elementos.
- clear: Esvazia a lista.

### Beecrowd
- 2381 - Lista de Chamada: Lê os nomes dos alunos e mostra o aluno sorteado na posição K.