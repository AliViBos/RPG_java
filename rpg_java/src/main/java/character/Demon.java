package rpg_java.src.main.java.character;

public class Demon extends Character {
    public Demon(String name) {
        super(name, 100, 15); // Exemplo de valores para saúde e poder de ataque
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " usa uma habilidade demoníaca!");
    }
}
