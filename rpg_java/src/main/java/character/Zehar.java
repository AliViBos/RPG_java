package rpg_java.src.main.java.character;

public class Zehar extends Character {

    public Zehar() {
        super("Zehar", 80, 25); // Exemplo de atributos para Zehar
    }

    @Override
    public void specialAbility() {
        System.out.println("Zehar uses Swift Strike!");
        attackPower += 7;
    }
}
