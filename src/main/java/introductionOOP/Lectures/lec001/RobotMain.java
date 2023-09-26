package introductionOOP.Lectures.lec001;

import introductionOOP.Lectures.lec001.Robot;

public class RobotMain {
    public static void main(String[] args) {

        Robot robot1 = new Robot();
        Robot robot2 = new Robot("Robocop");
        robot1.power();
        System.out.println(robot1);
        robot1.power();
        System.out.println(robot1);
        System.out.println(robot2);
    }
}
