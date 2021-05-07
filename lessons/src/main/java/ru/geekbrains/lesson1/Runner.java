package ru.geekbrains.lesson1;

public interface Runner {
    String getName();

    String getType();

    int getMaxDistance();

    int getMaxJump();

    default boolean run(int length) {
        if (length <= getMaxDistance()) {
            System.out.printf("%s %s пробежал %d м\n", getType(), getName(), length);
            return true;
        } else {
            System.out.printf("%s %s не может пробежать %d м и остановился на %d м\n", getType(), getName(), length, getMaxDistance());
            return false;
        }
    }

    default boolean jump(int height) {
        if (height <= getMaxJump()) {
            System.out.printf("%s %s перепрыгнул %d см стену\n", getType(), getName(), height);
            return true;
        } else {
            System.out.printf("%s %s не может перепрыгнуть %d см стену\n", getType(), getName(), height);
            return false;
        }
    }
}
