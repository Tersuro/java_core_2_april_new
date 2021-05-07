package ru.geekbrains.lesson1;

public class HomeworkMain {
    public static void main(String[] args) {
        Runner[] runners = {
                new Human("Vlad", 2200, 150),
                new Robot("RZ3", 8000, 20),
                new Cat("Barsik", 1280, 280),
                new Human("Gena", 2420, 170),
                new Robot("AT9", 10000, 100),
                new Cat("Cherry", 1430, 330)
        };

        Obstacle[] obstacles = {
          new Track(1500),
          new Wall(50),
          new Track(2400),
          new Wall(120),
          new Track(1020),
          new Wall(350)
        };

        for(Runner r : runners) {
            for(Obstacle o : obstacles) {
                if(o instanceof Track) {
                    r.run(o.getLength());
                } else {
                    r.jump(o.getHeight());
                }
            }
        }
    }
}
