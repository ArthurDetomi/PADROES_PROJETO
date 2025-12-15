# Mergulho nos padrões de projeto

## Solid

### S - Single Responsibility

Príncipio da responsabilidade única: Uma classe deve ter apenas uma razão para mudar, ou seja, cada classe deve ser resposável por uma única responsabilidade.

**Objetivo**: O principal objetivo é reduzir a complexidade, ao se ter classes com multiplos métodos e multiplas responsabilidades a medida que o código cresce, sua navegação pode se tornar lenta, pode ser difícil entender o que cada classe faz e quanto mais responsabilidades uma classe tem mais motivos para mudar ela possui, enfim, aumenta a complexidade do código.

### O - Open/Closed Principle

As classes devem ser abertas para extensão e fechadas para modificação.

**Ideia:** prevenir que o código existente quebre, quando implementa novas funcionalidades, uma classe ser fechada significa que ela está em seu estado final, o que algumas linguages de programação até permitem definir uma classe como final, ou seja, se uma classe já foi definida, testada, revisada e incluida, tentar mexer em seu código é arriscado (Fechada para modificações). Ao inves de modifica-la crie subclasses (Aberta para extensão)
    