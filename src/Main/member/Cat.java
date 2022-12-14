package Main.member;

public class Cat implements Members {

    private final String name;
    private final int jumpHeight;
    private final int maxRunLength;

    public Cat(String name, int jumpHeight, int maxRunLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public int run() {
        System.out.printf("Кот %s бежит дистанцию %d%n", name, maxRunLength);
        return maxRunLength;
    }

    @Override
    public int jump() {
        System.out.printf("Кот %s делает прыжок %d%n", name, jumpHeight);
        return jumpHeight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", jumpHeight=" + jumpHeight +
                ", maxRunLength=" + maxRunLength +
                '}';
    }
}
