package rpg_java.src.main.java.game;

import rpg_java.src.main.java.character.Character;

public class Battle {
    public void startBattle(Character player, Character enemy) {
        System.out.println("A batalha começou entre " + player.getName() + " e " + enemy.getName());
        
        // Exemplo de loop de combate simples
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            player.attack(enemy);
            if (enemy.getHealth() > 0) {
                enemy.attack(player);
            }
        }
        
        if (player.getHealth() > 0) {
            System.out.println(player.getName() + " venceu a batalha!");
        } else {
            System.out.println(player.getName() + " foi derrotado...");
        }
    }
}


