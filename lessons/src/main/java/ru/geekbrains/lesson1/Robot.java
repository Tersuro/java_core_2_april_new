package ru.geekbrains.lesson1;

public class Robot implements Runner {
    private final String name;
    private final String type;
    private final int maxDistance;
    private final int maxJump;

    public Robot(String name, int maxDistance, int maxJump) {
        this.name = name;
        this.type = "Robot";
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
