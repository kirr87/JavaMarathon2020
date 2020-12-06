package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(int stamina) {
        if (stamina > 0) {
            this.stamina = stamina;
                if (countPlayers < 6) {
                    countPlayers++;
                }
        }
    }

    public void run() {
        if (stamina > 0) {
            stamina--;
            if (stamina == 0 && countPlayers > 0) {
                countPlayers--;
            }
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else System.out.println("На поле нет свободных мест");
    }
}
