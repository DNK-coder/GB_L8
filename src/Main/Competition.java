package Main;

import Main.let.Let;
import Main.member.Members;

import java.util.LinkedList;
import java.util.List;

public class Competition {

    private Let[] lets;
    private Members[] members;
    private final String competitionTitle;

    private List<Members> lastWinners = new LinkedList<>();

    public Competition(String competitionTitle) {
        this.competitionTitle = competitionTitle;
    }

    public void setLet(Let... lets) {
        this.lets = lets;
    }

    public void setMembers(Members... members) {
        this.members = members;
    }

    public void startCompetition() {
        System.out.println("Начало соревнования " + competitionTitle);
        lastWinners.clear();

        for (Members members : members) {
            boolean success = passAllLets(members);
            if (!success) {
                System.out.println("Участник " + members + " покинул испытание");
            } else {
                lastWinners.add(members);
            }
        }
    }

    public List<Members> getLastWinners() {
        return lastWinners;
    }

    private boolean passAllLets(Members member) {
        for (Let let : lets) {
            if ( !member.doIt(let) ) {
                return false;
            }
            System.out.println();
        }
        return true;
    }
}
