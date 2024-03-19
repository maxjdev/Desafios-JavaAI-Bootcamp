## Descrição

O Singleton é uma abordagem de design de software que visa assegurar a existência de apenas uma instância de uma classe e fornecer um ponto centralizado para acessá-la. Isso é especialmente benéfico em contextos nos quais é desejável manter uma única ocorrência de uma classe responsável pelo controle de um recurso compartilhado, como configurações, conexões de banco de dados ou caches.

Neste desafio, você deve criar um sistema de gerenciamento de usuários que permita adicionar e listar usuários. Você tem a opção de implementar o padrão Singleton para garantir que haja apenas uma instância do gerenciador de usuários em toda a aplicação. No entanto, a implementação do padrão Singleton é opcional e você pode optar por seguir uma abordagem diferente para resolver o desafio, se preferir.

## Especificações do Desafio:
<b>1.</b> Crie uma classe User com os seguintes atributos: id (inteiro) e name (string).<br>
<b>2.</b> Implemente uma classe UserManager que siga o padrão Singleton. Esta classe deve possuir as seguintes funcionalidades:<br>
<b>• 2a - </b>Adicionar um novo usuário ao sistema, recebendo o nome como entrada.<br>
<b>• 2b - </b>Listar todos os usuários cadastrados.<br>
<b>3.</b> No programa principal (main), siga as etapas abaixo:<br>
<b>• 3a - </b>Solicite ao usuário a quantidade de usuários que deseja cadastrar.<br>
<b>• 3b - </b>Peça ao usuário para informar os nomes dos usuários, um por linha.<br>
<b>• 3c - </b>Após receber os nomes e cadastrar os usuários, liste os usuários cadastrados.<br>

## Entrada
Um número inteiro representando a quantidade de usuários que o usuário deseja cadastrar.

Para cada usuário a ser cadastrado, uma string contendo o nome do usuário.

## Saída
Uma lista com os nomes dos usuários cadastrados.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada   | Saída           |
|-----------|-----------------|
| 2         | 1 - Ada         |
| Ada       | 2 - Linus       |
| Linus     |                 |
| --------- | --------------- |
| 3         | 1 - Grace       |
| Grace     | 2 - Alan        |
| Alan      | 3 - Steve       |
| Steve     |                 |
| --------- | --------------- |
| 4         | 1 - Tim         |
| Tim       | 2 - Margaret    |
| Margaret  | 3 - John        |
| John      | 4 - Richard     |
| Richard   |                 |