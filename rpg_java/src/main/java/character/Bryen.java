package rpg_java.src.main.java.character;

public class Bryen extends Character {
    
    public Bryen() {
        super("Bryen", 100, 15);
    }
    
    @Override
    public void specialAbility() {
        System.out.println("Bryen uses Light Shield!");
        health += 20;
    }
}
