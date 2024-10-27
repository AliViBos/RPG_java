package rpg_java.src.main.java.character;

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
    
    // Adicionando o método getHealth para evitar o erro
    public int getHealth() {
        return health;
    }
}

