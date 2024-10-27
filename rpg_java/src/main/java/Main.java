package rpg_java.src.main.java;

import rpg_java.src.main.java.character.*;
import rpg_java.src.main.java.story.Story;
import rpg_java.src.main.java.game.Battle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Introdução da história
        Story story = new Story();
        story.startIntroduction();

        // Escolha do personagem pelo usuário
        System.out.println("\nEscolha seu personagem:");
        System.out.println("1. Bryen");
        System.out.println("2. Hagnar");
        System.out.println("3. Chazak");
        System.out.println("4. Zehar");
        System.out.println("5. Eliya");
        
        int choice = scanner.nextInt();
        rpg_java.src.main.java.character.Character player;

        switch (choice) {
            case 1:
                player = new Bryen();
                break;
            case 2:
                player = new Hagnar();
                break;
            case 3:
                player = new Chazak();
                break;
            case 4:
                player = new Zehar();
                break;
            case 5:
                player = new Eliya();
                break;
            default:
                System.out.println("Opção inválida. Bryen será seu personagem.");
                player = new Bryen();
                break;
        }

        player.showStats();

        // Equipar uma arma no início do jogo
        System.out.println("\nEscolha uma arma para seu personagem:");
        System.out.println("1. Espada Lendária (Damage: 20)");
        System.out.println("2. Arco Antigo (Damage: 15)");
        System.out.println("3. Machado Pesado (Damage: 25)");
        
        choice = scanner.nextInt();
        Weapon weapon;

        switch (choice) {
            case 1:
                weapon = new Weapon("Espada Lendária", 20);
                break;
            case 2:
                weapon = new Weapon("Arco Antigo", 15);
                break;
            case 3:
                weapon = new Weapon("Machado Pesado", 25);
                break;
            default:
                System.out.println("Opção inválida. Nenhuma arma será equipada.");
                weapon = null;
                break;
        }

        if (weapon != null) {
            player.equipWeapon(weapon);
        }

        // Enfrentar o inimigo
        System.out.println("\nEscolha seu oponente:");
        System.out.println("1. Low Demon");
        System.out.println("2. Dark Sorcerer");
        System.out.println("3. Aven");

        choice = scanner.nextInt();
        rpg_java.src.main.java.character.Character enemy;

        switch (choice) {
            case 1:
                enemy = new Demon("Low Demon");
                break;
            case 2:
                enemy = new Demon("Dark Sorcerer");
                break;
            case 3:
                enemy = new Demon("Aven");
                break;
            default:
                System.out.println("Opção inválida. Você enfrentará um Low Demon.");
                enemy = new Demon("Low Demon");
                break;
        }

        Battle battle = new Battle();
        System.out.println("\nPrepare-se para a batalha!");
        battle.startBattle(player, enemy);

        scanner.close();
    }
}