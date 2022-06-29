package day7;

import java.util.Random;

class Player {
    public int stamina;
    public final static int MAX_STAMINA = 100;
    public final static int MIN_STAMINA = 0;
    public static int countPlayer;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayer >= 0 && countPlayer < 6) {
            countPlayer++;
        }
    }

    public int getStamina() {
        return stamina;
    }
    public int getCountPlayer() {
        return countPlayer;
    }
    public void run() {
        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayer--;
        }
    }
    public static void info() {
        if (countPlayer < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayer) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

}

public class Task2 {
    public static void main(String[] args) {
        Random ran = new Random();
        int x = ran.nextInt(11) + 90;

        Player pl1 = new Player(x);
        Player pl2 = new Player(x);
        Player pl3 = new Player(x);
        Player pl4 = new Player(x);
        Player pl5 = new Player(x);
        Player pl6 = new Player(x);
        Player pl7 = new Player(x);

        Player.info();

        System.out.println(Player.countPlayer);
        System.out.println(pl1.getStamina());

        while (pl1.stamina != 0) {
            pl1.run();
        }
        System.out.println(Player.countPlayer);
    }
}
