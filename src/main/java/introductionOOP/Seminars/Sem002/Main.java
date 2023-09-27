package introductionOOP.Seminars.Sem002;

public class Main {
    public static void main(String[] args) {

        Runner[] runners = {
          new Cat("cat1", 1111, 111),
          new Cat("cat2", 2222, 222),
          new Human("human1", 3333, 333),
          new Human("human2", 4445, 444),
          new Robot("robot1", 4444, 444),
          new Robot("robot2", 4444, 444),
        };

        Obstacle[] obstacles = {
          new Wall(222),
          new Wall(333),
          new Wall(111),
          new Track(1111),
          new Track(2222),
          new Track(4445),
        };

        for (Runner runner : runners) {
                System.out.println(runner.getClass().getSimpleName());
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Wall) {
                    if(!runner.jump(obstacle.getHeight())) {
                        break;
                    }
                } else if (obstacle instanceof Track) {
                    if(!runner.run(obstacle.getLength())) {
                        break;
                    }
                }
            }

        }
    }
}
