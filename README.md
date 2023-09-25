# BinaryTree

PjBL 2 - Binary Tree (Arthur Correia Brígido e Bell Jamyle Duwe Klemann)

Nossa aplicação demonstra o funcionamento de uma árvore binária de busca e as funções que a compõe, como inserção, busca e exclusão de elementos e também a impressão da árvore. Uma árvore binária de busca serve para armazenar dados e posteriormente recuperá-los.

- Classe "BinaryTree": é nessa classe que as principais funções da aplicação são implementadas.
  - "insert": insere os novos nós na árvore.
<img width="412" alt="Screenshot 2023-09-24 at 18 52 04" src="https://github.com/belljamyle/BinaryTree/assets/128303802/8bda749f-e9db-4a5b-a706-f11b4ae2b491">
  - "search": verifica se o dado passado na função está inserido na árvore ou não.
<img width="369" alt="Screenshot 2023-09-24 at 20 59 22" src="https://github.com/belljamyle/BinaryTree/assets/128303802/39e5adbd-2f23-41a2-b205-5412fdbf25ff">
  - "delete": deleta o valor informado da árvore. Verifica se há o valor inserido na árvore e informa o nó deletado, assim como retorna o nó raiz.
<img width="509" alt="Screenshot 2023-09-24 at 21 02 10" src="https://github.com/belljamyle/BinaryTree/assets/128303802/7b858ed6-f87a-43b6-8444-64abc0116fc8">
  - "printTree": imprime a árvore horizontalmente. (Copiado do site: https://www.techiedelight.com/pt/c-program-print-binary-tree/).
<img width="513" alt="Screenshot 2023-09-24 at 21 10 36" src="https://github.com/belljamyle/BinaryTree/assets/128303802/e9c2068e-b365-4019-88aa-1d879de8e15a">

- Classe "Node": classe do nó da árvore binária. Nele fazemos referência aos nós sucessores da direita e da esquerda e armazenamos o dado do nó.
<img width="198" alt="Screenshot 2023-09-24 at 21 25 18" src="https://github.com/belljamyle/BinaryTree/assets/128303802/d9827938-49f8-468b-a614-08398a53c7e7">

- Classe "Trunk": classe de apoio à função de impressão da árvore binária.
<img width="240" alt="Screenshot 2023-09-24 at 21 43 20" src="https://github.com/belljamyle/BinaryTree/assets/128303802/ad252a70-3f5e-4b14-9e13-52d886db2d21">

- Classe "Main": a classe inicia uma nova árvore binária. Nela utilizamos todas as funções implementadas na aplicação: "insert", "search", "delete" e "printTree".
<img width="558" alt="Screenshot 2023-09-24 at 21 49 04" src="https://github.com/belljamyle/BinaryTree/assets/128303802/86bc08a9-58f1-452b-9d45-abf201bec768">
