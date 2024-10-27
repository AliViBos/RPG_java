package rpg_java.src.main.java.character;

public class Eliya extends Character {

    public Eliya() {
        super("Eliya", 90, 12); // Exemplo de atributos para Eliya
    }

    @Override
    public void specialAbility() {
        System.out.println("Eliya uses Healing Touch!");
        health += 30;
    }
}
