package Main.member;

import Main.let.Let;

public interface Members {

    int run();

    int jump();

    default boolean doIt(Let let) {
        return doAction(let);
    }

    default boolean doAction(Let let) {
        return let.passLetBy(this);
    }

}
