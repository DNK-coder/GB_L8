package Main.let;

import Main.member.Members;

public class Wall implements Let {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean passLetBy(Members participant) {
        if (participant.jump() > height) {
            System.out.println("Участник " + participant + " успешно перепрыгнул стену");
            return true;
        }
        else {
            System.out.println("Участник " + participant + " не смог перепрыгнуть стену " + height);
            return false;
        }
    }
}
