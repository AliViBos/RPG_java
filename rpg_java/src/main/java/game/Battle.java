package rpg_java.src.main.java.game;

import rpg_java.src.main.java.character.Character;

public class Battle {

    public void startBattle(Character player, Character enemy) {
        System.out.println("A batalha começou entre " + player.getName() + " e " + enemy.getName());
        
        // Loop de combate
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            // Turno do jogador
            player.attack(enemy);
            
            // Verifica se o inimigo ainda está vivo
            if (enemy.getHealth() > 0) {
                // Turno do inimigo
                enemy.attack(player);

                // Verifica a condição para o jogador usar a habilidade especial
                if (player.getHealth() <= 75) {
                    System.out.println(player.getName() + " ativa sua habilidade especial!");
                    player.specialAbility();
                }
                
                // Verifica a condição para o inimigo usar a habilidade especial
                if (enemy.getHealth() <= 50) {
                    System.out.println(enemy.getName() + " ativa sua habilidade especial!");
                    enemy.specialAbility();
                }
            }
        }
        
        // Resultado da batalha
        if (player.getHealth() > 0) {
            System.out.println(player.getName() + " venceu a batalha!");
        } else {
            System.out.println(player.getName() + " foi derrotado...");
        }
    }
}
