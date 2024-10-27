package rpg_java.src.main.java.character;

public class Hagnar extends Character {

    public Hagnar() {
        super("Hagnar", 120, 10); // Exemplo de atributos para Hagnar
    }

    @Override
    public void specialAbility() {
        System.out.println("Hagnar uses Wisdom Strike!");
        attackPower += 5;
    }
}

