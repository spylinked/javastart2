package Day_7;

import java.util.Random;

public class Football {
    public static void main(String[] args) {
        Random rnd = new Random();
        String[] playerFirstName = {"Маринато", "Игорь", "Вячаслав", "Георгий", "Далер", "Магомед", "Антон", "Александр", "Юрий", "Пётр", "Сослан"};
        String[] playerLastName = {"Гильерме", "Дивеев", "Караваев", "Джикия", "Кузяев", "Оздоев", "Миранчук", "Ерохин", "Жирков", "Джамаев", "Акинфеев"};

        Player[] players = new Player[Player.getMaxPlayers()];

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(playerFirstName[rnd.nextInt(playerFirstName.length)] + " " + playerLastName[rnd.nextInt(playerLastName.length)]);
            players[i].info();
        }
        Pitch pitch = new Pitch(players);
        pitch.play();

    }
}

class Player{
    private String name;
    private boolean onPitch = false;
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static final int MAX_PLAYERS = 12;

    public Player(String name) {
        Random rnd = new Random();
        this.stamina = rnd.nextInt(11)+90;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getMaxPlayers() {
        return MAX_PLAYERS;
    }

    public boolean isOnPitch() {
        return onPitch;
    }

    public int getStamina() {
        return stamina;
    }

    public void info() {
        System.out.println("Игрок: " + this.name + "| Стамина: " + this.stamina);
    }

    public void run() {
        this.stamina--;
    }

    public void setOnPitch(boolean onPitch) {
        this.onPitch = onPitch;
    }

    public static int getMinStamina() {
        return MIN_STAMINA;
    }
}

class Pitch {
    private static final int NEED_PLAYERS = 6;
    private static Player[] players;
    private static boolean stopGame = false;
    private static Player[] playersOnPitch = new Player[NEED_PLAYERS];


    public Pitch(Player[] players) {
        this.players = players;
        System.out.print("На поле: ");
        for (int i = 0; i < NEED_PLAYERS; i++) {
            System.arraycopy(players, i, playersOnPitch, i, 1);
            this.players[i].setOnPitch(true);
            System.out.print(this.players[i].getName() + "; ");
        }
        System.out.println();
    }

    public void play() {
        Random rnd = new Random();
        int playerIndex;
        while (!stopGame) {
            playerIndex = rnd.nextInt(playersOnPitch.length);
            playersOnPitch[playerIndex].run();
            if (playersOnPitch[playerIndex].getStamina() == Player.getMinStamina()) {
                System.out.println("У " + playersOnPitch[playerIndex].getName() + " закончилась стамина");
                System.out.print("Остальные: ");
                for (int i = 0; i < this.playersOnPitch.length; i++) {
                    System.out.print(this.playersOnPitch[i].getName() + " " + this.playersOnPitch[i].getStamina() + "; ");
                }
                System.out.println();
                stopGame = this.substitute(playerIndex);
            }
        }
        System.out.println("Замен не осталось, игра окончена.");
    }

    public boolean substitute(int playerIndex) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].getStamina() > Player.getMinStamina() && !players[i].isOnPitch()) {
                System.out.println("Заменяем " + playersOnPitch[playerIndex].getName() + " на " + players[i].getName());
                System.arraycopy(players, i, playersOnPitch, playerIndex, 1);
                this.players[playerIndex].setOnPitch(false);
                this.players[i].setOnPitch(true);
                System.out.print("Новый состав: ");
                for (int j = 0; j < this.playersOnPitch.length; j++) {
                    System.out.print(this.playersOnPitch[j].getName() + " " + this.playersOnPitch[j].getStamina() + "; ");
                }
                System.out.println();
                return false;
            }
        }
        return true;
    }
}
