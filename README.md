# STACK-USERS-QUESTION:grey_exclamation:
## QUAL O PROBLEMA A SER RESOLVIDO:grey_question:
Um desenvolvedor de software precisa implementar uma funcionalidade que permita
ao usuário desfazer a última ação realizada na aplicação. Implemente uma solução em
Java que utilize pilhas para armazenar as ações realizadas pelo usuário e permite
desfazer a última ação.
Vocês devem definir a estrutura de dados para a pilha e implementar funções que
permitam inserir e remover elementos da pilha. Além disso, o aluno deve definir a
lógica de desfazer a última ação realizada pelo usuário, que consiste em remover o
último elemento inserido na pilha e executar a ação inversa. A estrutura deve permitir
desfazer até 16 ações de uma só vez, mas sempre respeitando a pilha de execuções.

## QUAL A RESOLUÇÃO DO PROBLEMA:grey_question:
### PILHA GENÉRICA:speech_balloon:

Foi criado uma classe de pilha genérica com a lógica LIFO(Last in First out), usando os seguinte Métodos: pop(remover o primeiro da pilha, no caso o ultimo da lista que foi criada), push(adiciona o item, e conforme vai adicionado, vai indo para o final da pilha), top(exibe o topo da pilha, no caso o último item da lista), is Empty(é um booleano que afirma se a pilha está vazia ou com algum item),size(retorna o tamanho da pilha). É tambem criado um metodo To String para sobrescrever o que já existe, retornando a lista ao contrário para printar em formato de pilha.

### DEMAIS CLASSES:speech_balloon:

Foi criado uma classe ação pra indicar qual ação está praticando.

Foi criado uma classe Usuário, que recebe como atributo um nome e é criado uma pilha do tipo ação, onde será armazenado as ações do usuário, e de onde poderá ser retirado 16 ações de uma só vez, com o método de deletar ações, onde recebe como parâmetro a quantidade de ações que quer remover, limitando a no máximo 16 ações que poderão ser removidas de uma só vez, lembrando que se a quantidade passada for negativa ou for maior que a pilha, irá apresentar o erro: "IndexOutOfBoundsException()", e caso a quantidade for maior que 16, apresentará o seguinte erro:"ArrayIndexOutOfBoundsException()".

O testador irá criar um ursuário pelo nome, e esse usurário irá realizar ações que serão armazenadas na pilha.
