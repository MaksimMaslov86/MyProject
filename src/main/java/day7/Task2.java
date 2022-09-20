package day7;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random ran = new Random();
        Player player1 = new Player(ran.nextInt(11) + 90);
        Player player2 = new Player(ran.nextInt(11) + 90);
        Player player3 = new Player(ran.nextInt(11) + 90);
        Player player4= new Player(ran.nextInt(11) + 90);
        Player player5 = new Player(ran.nextInt(11) + 90);
        Player player6 = new Player(ran.nextInt(11) + 90);
        Player player7 = new Player(ran.nextInt(11) + 90);
        Player player8 = new Player(ran.nextInt(11) + 90);

        System.out.println(Player.getCountPlayer());
        Player.info();

        for (int i = player1.getStamina(); i > 0; i--) {
            player1.run();
            System.out.println(player1.getStamina());
        }
        Player.info();
    }
}
class Player {
    private int stamina;
    final static int MIN_STAMINA = 0;
    final static int MAX_STAMINA = 100;
    public static int countPlayer = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayer >= 0 && countPlayer < 6) {
            countPlayer++;
        }
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    public int getStamina() {
        return stamina;
    }
    public static int getCountPlayer() {
        return countPlayer;
    }
    public void run() {
        if (stamina > 0) {
            stamina--;
        }
        if (stamina == MIN_STAMINA && countPlayer > 0) {
            countPlayer--;
        }
    }
    public static void info() {
        if (countPlayer < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayer) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест.");
        }
    }
}