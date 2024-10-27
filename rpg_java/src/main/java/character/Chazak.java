package rpg_java.src.main.java.character;

public class Chazak extends Character {

    public Chazak() {
        super("Chazak", 150, 20); // Exemplo de atributos para Chazak
    }

    @Override
    public void specialAbility() {
        System.out.println("Chazak uses Mighty Blow!");
        attackPower += 10;
    }
}

