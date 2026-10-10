# builder-pattern

## Estrutura

- Duas branches: sem-builder-pattern e com-builder-pattern
- Ambas realizam a implementação de testes criacionais sobre a classe a classe User.java
## Contexto

- User.java representa usuários em um site de empregos, onde cada usuário pode ser ADMIN, CANDIDATO ou EMPREGADOR;
- Cada usuário possui nome, email e uma permissão. Todavia, os campos Curriculo, telefone e endereço são opcionais;
- Os objetos criados da classe User.java são imutáveis para fins de segurança, sendo modificados somente diretamente
no banco de dados;

## Sobre os testes sem Builder pattern

- Necessário construir vários construtores para cobrir as possibilidades de campos opcionais -> gera bagunça de código;
- Os construtores possuem muitos campos, gerando uma carga cognitiva muito grande para lembrar do significado dos 
atributos e a sua ordem em cada construtor;
- Para evitar vários construtores, podemos passar "null" para os campos opcionais -> gera ambiguidade do código, uma vez
que não sabemos de imediato o que aquele null significa.

## Sobre os testes com Builder pattern

- Classe mais limpa, com a sua construção delegada para uma classe específica (segue o princípio da responsabilidade
única);
- Testes com criações mais legíveis, com métodos que descrevem seus atributos, sendo os mesmos chamados na ordem que
preferir;
- Para campos opcionais, basta não chamar os seus métodos de atribuição, ficando assim sub entendido que eles não estão
presentes na instância.
- Mantém a imutabilidade para uma classe sem setters, fornece flexibilidade na chamada de métodos descritivos e
com ordem arbitrária, o que também aumenta a legibilidade do código.