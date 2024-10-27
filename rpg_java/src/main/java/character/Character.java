package rpg_java.src.main.java.character;

public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected Weapon weapon;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void showStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        if (weapon != null) {
            System.out.println("Weapon: " + weapon);
        }
    }

    public abstract void specialAbility();

    public void attack(Character enemy) {
        int totalAttackPower = attackPower + (weapon != null ? weapon.getDamage() : 0);
        System.out.println(name + " attacks " + enemy.getName() + " with " + (weapon != null ? weapon.getName() : "bare hands"));
        enemy.takeDamage(totalAttackPower);
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage, remaining health: " + health);
    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(name + " equips " + weapon.getName());
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
