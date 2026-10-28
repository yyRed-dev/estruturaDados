# Filas
Repositório para estudos e testes de filas (estáticas, dinâmicas e de prioridade) durante as aulas de Estrutura de Dados.

### Classes
- FilaEstatica: Fila estática, guarda os elementos em um vetor com índices de início e fim.
- FilaDinamica: Fila dinâmica, usa nós (`Node`) com referência para o primeiro e o último.
- FilaPrioridade: Fila de prioridade ordenada, insere cada elemento já na posição de acordo com a prioridade.
- FilaPrioridadeNO: Fila de prioridade não ordenada, insere no final e procura o de menor prioridade na hora de remover.
- Node / NoP: Nós usados pelas filas dinâmicas (o `NoP` guarda também a prioridade).
- Main: Testes das filas.

### Métodos
- enqueue: Adiciona um elemento no final da fila (nas filas de prioridade, junto com a prioridade).
- dequeue: Remove o elemento do início da fila (ou o de maior prioridade).
- peek: Mostra o primeiro elemento da fila.
- empty: Verifica se a fila está vazia.
- size: Mostra a quantidade de elementos.
- clear: Esvazia a fila.

### Beecrowd
- 1110 - Throwing Cards Away I: Simula o descarte de cartas e mostra as descartadas e a que sobrou.
- 2460 - Fila: Lê a fila de pessoas e as que saíram dela (em andamento).