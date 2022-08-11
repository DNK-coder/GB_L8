package Main;

import Main.member.Men;
import Main.let.Track;
import Main.member.Cat;
import Main.let.Wall;
import Main.member.Members;
import Main.member.Robot;

import java.util.Random;

public class GBL8 {

    public static void main(String[] args) {
        System.out.println("Подготовительный этап...");
        Competition competition = createAndPrepareCompetition();

        System.out.println("Начинаем соревнование!");
        competition.startCompetition();

        System.out.println("Соревнование окончено! Победители:");
        for (Members winner : competition.getLastWinners()) {
            System.out.println(winner);
        }
    }

    private static Competition createAndPrepareCompetition() {
        Members person = new Men("Олег", 50, 500);
        Members cat = new Cat("Виталий", 200, 1500);
        Members robot = new Robot("Robot",  150, 5000);

        Random random = new Random();

        Wall wall = new Wall(random.nextInt(200));
        Track track = new Track(random.nextInt(1500));

        Competition competition = new Competition("Соревнования");
        competition.setMembers(person, cat, robot);
        competition.setLet(wall, track);
        return competition;
    }
}
