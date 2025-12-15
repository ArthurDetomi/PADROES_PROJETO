# Mergulho nos padrões de projeto

## Solid

### S - Single Responsibility

Príncipio da responsabilidade única: Uma classe deve ter apenas uma razão para mudar, ou seja, cada classe deve ser resposável por uma única responsabilidade.

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
