// Caminho: rpg_java/src/main/java/Main.java
package rpg_java.src.main.java;

import rpg_java.src.main.java.character.Bryen;
import rpg_java.src.main.java.character.Demon;
import rpg_java.src.main.java.story.Story;
import rpg_java.src.main.java.game.Battle;

public class Main {
    public static void main(String[] args) {
        // Introdução da história
        Story story = new Story();
        story.startIntroduction();

        // Criação do personagem Bryen
        Bryen bryen = new Bryen();
        bryen.showStats();

        // Início de uma batalha com um demônio
        Battle battle = new Battle();
        battle.startBattle(bryen, new Demon("Low Demon"));
    }
}
