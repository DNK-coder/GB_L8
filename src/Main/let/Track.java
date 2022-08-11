package Main.let;

import Main.member.Members;

public class Track implements Let {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean passLetBy(Members member) {
        if (member.run() > length) {
            System.out.println("Участник " + member + " успешно пробежал дистанцию");
            return true;
        }
        else {
            System.out.println("Участник " + member + " не смог пробежать дистанцию " + length);
            return false;
        }
    }
}
