package ru.geekbrains.lesson1;

public class Cat implements Runner{
    private final String name;
    private final String type;
    private final int maxDistance;
    private final int maxJump;

    public Cat(String name, int maxDistance, int maxJump) {
        this.name = name;
        this.type = "Cat";
        this.maxDistance = maxDistance;
        this.maxJump = maxJump;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }
}
