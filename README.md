# Livros: Mergulho nos padrões de projeto e Use a Cabeça: Padrões de Projeto

## Solid

### S - Single Responsibility

Príncipio da responsabilidade única: Uma classe deve ter apenas uma razão para mudar, ou seja, cada classe deve ser responsável por uma única responsabilidade.

**Objetivo**: O principal objetivo é reduzir a complexidade, ao se ter classes com multiplos métodos e multiplas responsabilidades a medida que o código cresce, sua navegação pode se tornar lenta, pode ser difícil entender o que cada classe faz e quanto mais responsabilidades uma classe tem mais motivos para mudar ela possui, enfim, aumenta a complexidade do código.

### O - Open/Closed Principle

As classes devem ser abertas para extensão e fechadas para modificação.

**Ideia:** prevenir que o código existente quebre, quando implementa novas funcionalidades, uma classe ser fechada significa que ela está em seu estado final, o que algumas linguages de programação até permitem definir uma classe como final, ou seja, se uma classe já foi definida, testada, revisada e incluida, tentar mexer em seu código é arriscado (Fechada para modificações). Ao inves de modifica-la crie subclasses (Aberta para extensão)

### L - Liskov Substitution Principle

Quando estendemos uma classe, deve ser possível passar uma subclasse em lugar de objetos da classe mãe sem quebrar o código cliente.

**Contextualizando:** A subclasse deve permanecer compatível com o comportamento da superclasse. Quando sobreescreve um método deve-se estender o comportamento base ao invés de substitui-lo com algo completamente diferente.

**Requerimentos:**

- Os tipos de parâmetros em um método de uma subclasse deve coincidir ou serem mais abstratos que os tipos de parâmetros da superclasse.

- O tipo de retorno de um método de uma subclasse deve coincidir ou ser um subtipo do tipo de retorno no método da superclasse.

- Um método em uma subclasse não deve lançar tipos de exceções que não são esperados que o método base lançaria.

- Uma subclasse não deve fortalecer pré-condições. Por exemplo, o método base tem um parâmetro com tipo int. Se uma subclasse sobrescreve este método e precisa que o valor de um argumento passado para o método deve ser positivo (lançando uma exceção se o valor é negativo), isso torna as pré-condições mais fortes. O código cliente, que funcionava bem até agora quando números negativos eram passados no método, agora quebra se ele começa a trabalhar com um objeto desta subclasse.

- Invariantes de uma superclasse devem ser preservadas. As invariantes são condições nas quais um objeto faz sentido. ex: um gato ter quatro patas, uma cauda e ter a habilidade de miar.

- Uma subclasse não deve mudar valores de campos privados da superclasse. Algumas linguagens de programação permitem acesso a membros privados de uma classe, como (Python, Javascript).

### I - Interface Segregation Principle

Uma classe cliente nunca deve ser forçada a depender de métodos que não usa.

- As interfaces devem ser reduzidas o suficiente para que classes não tenham que implementar comportamentos que não precisam.
- Quebrar interfaces "gordas" em classes mais granulares e específicas. Os clientes devem implementar somente aqueles métodos que realmente precisam.

### D - Dependency Inversion Principle

Classes de alto nível não devem depender de classes de baixo nível. Ambas devem depender de abstrações. As abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.

- **Classes de baixo nível:** implmentaam operações básicas como trabalhar com um disco, transferindo dados pela rede, conectar-se a uma base de dados,etc.
- **Classes de alto nível:** contém lógica de negócio complexa que direcionam classes de baixo nível

O príncipio de inversão de dependência sugere trocar a direção da dependência, como aplicar:

- 1. Para começar, você precisa descrever as interfaces para as operações de baixo nível que as classes de alto nível dependem, preferivelmente em termos de negócio. Por exemplo, a lógica do negócio deve chamar um método abrirRelatório(arquivo) ao invés de uma série de métodos abrirArquivo(x), lerBytes(n), fecharArquivo(x). Estas interfaces contam como de alto nível.

2. Agora você pode fazer classes de alto nível dependentes daquelas interfaces, ao invés de classes concretas de baixo nível. Essa dependência será muito mais suave que a original.
3. Uma vez que as classes de baixo nível implementam essas interfaces, elas se tornam dependentes do nível da lógica do negócio, revertendo a direção da dependência original.

O princípio de inversão de dependência quase sempre anda junto com o princípio aberto/fechado: você pode estender classes de baixo nível para usar diferentes classes de lógica do negócio sem quebrar classes existentes.

---

## Padrões de Projeto

Utilização do livro: Use a cabeça Padrões de Projeto.

### Strategy

O padrão Strategy define uma família de algoritmos, encapsula cada um deles e os torna intercambiaveis. A estrategia deixa o algoritmo variar independentemente dos clientes que o utilizam.

**Princípios de projeto**

1. Indentifique os aspectos de seu aplicativo que variam e separe-os que permanece igual
2. Programe para uma interface não para uma implementação
3. Dar prioridade a composição ao invés de herança

### Observer

O **Padrão Observer** define a dependência um-para-muitos entre objetos para que quando um objeto mude de estado todos os seus dependentes sejam avisados e atualizados automaticamente.

**Editora(Subject) + Assinantes (Observer) = Padrão Observer**

O subject implementa uma interface Subject que possui métodos como registrar, remover e notificar observadores, e os observadores implementam uma interface Observer com o método update, o Subject terá uma lista de observadores o qual serão noticiados quando seu estado de interesse dos observadores for modificado.

Adiciona uma ligação leve entre os objetos pois os observadores só sabem que o objeto concreto implementa a interface Subject e o Subject sabe que seus observadores implementam a interface Observer.

Os observadores podem ser adicionados e removidos em tempo de execução.

**Princípios de projeto**

- Busque designs levemente ligados entre objetos que interagem. Projetos levemente ligados permitem contruir sistemas OO flexíveis que podem lidar com mudanças que minimizam a interdepêndencia entre os objetos.

#### Como o padrão Observer lida com os princípios de design

---

**Princípio:** Identifique os aspectos de seu aplicativo que variam e separe-os do que continua igual:

O que varia no padrão Observer é o estado do sujeito e o número e os tipos de observadores. Com esse padrão, pode-se variar os objetos que dependem do estado do sujeito sem ter que alterar esse sujeito.

---

**Princípio:** Programe para uma interface, e não para uma implementação

Sujeito e observador usam interfaces. O sujeito monitora os objetos que implementam a interface Observer, enquanto os observadores registram e são notificados pela interface Subject. O que mantém as coisas bem e levemente ligadas.

---

**Princípio:** Dê prioridade à composição em relação à herança

O padrão Observer utiliza composição para compor qualquer número de observador com seus sujeitos. Essas relações não são configuradas por algum tipo de hierarquia de herança. São configuradas no tempo de execução pela composição.

---

### Decorator

O padrão **Decorator** anexa responsabilidades adicionais a um objeto dinamicamente. Os decoradores fornecem uma alternativa flexível de subclasse para estender a funcionalidade.

---

**Princípio:** As classes devem estar abertas para a extensão, mas fechadas para modificação.

---

**Pontos chaves:**

- Em nossos projetos deveríamos permitir que o comportamento fosse estendido sem a necessidade de modificar o código existente.
- Composição e delegação podem ser sempre usadas para adicionar novos comportamentos no tempo de execução.
- O padrão Decorator envolve um conjunto de classes de decorador uasdas para englobar componentes concretos.
- As classes de decorador espelham o tipo que os componentes decoram. (Na verdade, elas são do mesmo tipo que os componentes que decoram, seja por herança ou por implementação de interface).
- Os decoradores mudam o comportamento de seus componentes adicionando novos recursos antes e/ou depois (ou mesmo no lugar) de chamadas de método para o componente.
- Pode-se englobar um componente com qualquer número de decoradores.
- Os decoradores podem resultar em muitos objetos pequenos em nosso design e o uso exagerado pode ser complexo.
