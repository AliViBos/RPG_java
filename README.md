# RPG Atherak: Um RPG em Java com Orientação a Objetos

## Integrantes do Projeto

- Alice Vitória Boschetti
- Felipe Cordeiro Carvalho
- Eduardo Marques dos Santos

## Descrição do Projeto

*RPG Atherak* é um jogo de RPG desenvolvido em Java, utilizando conceitos de Orientação a Objetos. A história é centrada no reino fictício de Atherak, onde o justo rei Baruch passa o trono ao seu filho mais novo, Toviah. Isso desencadeia uma série de eventos dramáticos e conflitos entre Toviah e seu irmão mais velho, Aven, levando o reino a uma nova era de batalhas.

### Estrutura do Projeto

O projeto está organizado em uma estrutura de pastas que facilita a gestão do código, permitindo a criação de classes específicas para personagens, mecânicas de combate e narrativa.

- *Pasta character*: Classes para os personagens, tanto jogáveis quanto inimigos.
- *Pasta game*: Mecânicas de jogo, incluindo o sistema de combate.
- *Pasta story*: História e narrativa do jogo.

## História

### Contexto

No reino de *Atherak, o rei **Baruch* decide passar o trono para seu filho mais novo, *Toviah, por acreditar em sua sabedoria e bondade. Isso desperta grande ira em **Aven*, o filho mais velho, que busca vingança contra o irmão e contra o reino.

### A Batalha de Akathon

Após a decisão de Baruch, uma guerra devastadora chamada *Batalha de Akathon* ocorre, onde os seguidores de Toviah (os *Toviahnos) lutam contra o exército sombrio de Aven (os **Averanos). Com a ajuda de cinco guerreiros lendários – **Bryen, **Hagnar, **Chazak, **Zehar* e *Eliya* – Toviah sai vitorioso. Após a batalha, Aven é exilado no purgatório *Ma'atzar*.

### A Traição de Avush

*Avush*, um general do exército de Toviah encarregado de vigiar Aven, é corrompido pelo desejo de poder e liberta Aven em troca de promessas de glória. Aven começa a formar um novo exército demoníaco para retomar o reino, e os cinco guerreiros são novamente convocados para detê-lo.

### O Confronto Final

No confronto final, Toviah e seus guerreiros enfrentam Aven e seu exército. *Avush* revela sua traição, mas é derrotado pelos guerreiros. Aven também é finalmente subjugado, restaurando a paz em Atherak.

### Final Alternativo

Em uma versão alternativa, Aven tem um momento de redenção e aceita o exílio permanente.

## Estrutura do Código

### Classes Principais

1. *Character.java*: Classe abstrata que representa um personagem genérico, com atributos como name, health e attackPower.
2. *Bryen.java, Hagnar.java, etc.*: Classes específicas para cada guerreiro, que herdam de Character e implementam habilidades únicas.
3. *Demon.java*: Representa os inimigos demoníacos, com habilidades próprias.
4. *Battle.java*: Classe para gerenciar o sistema de batalha, alternando ataques entre o jogador e o inimigo.
5. *Story.java*: Introduz a história, com eventos e diálogos que ocorrem ao longo do jogo.

### Exemplo de Código

#### Character.java

Define as propriedades e métodos básicos para qualquer personagem no jogo.

```java
public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void showStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
    }

    public abstract void specialAbility();

    public void attack(Character enemy) {
        System.out.println(name + " attacks " + enemy.getName());
        enemy.takeDamage(attackPower);
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage, remaining health: " + health);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}