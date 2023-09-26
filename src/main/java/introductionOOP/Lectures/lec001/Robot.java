package introductionOOP.Lectures.lec001;

import java.util.ArrayList;

public class Robot {

    enum State {
        On, Off
    }

    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<>();
    }
    private String name;
    private int level;

    private State state;

    private Robot(String newName, int level) {
        if (newName.isEmpty() || Character.isDigit(newName.charAt(0))
        || Robot.names.contains(newName)){
            this.name = String.format("DefaulName_%s", defaultIndex++);
        } else {
            this.name = newName;
        }
        Robot.names.add(newName);
        this.level = level;
        this.state = State.Off;
    }

    public Robot(String newName) {
        this(newName, 1);
    }

    public Robot() {
        this("", 1);
    }

    public void power(){
        if (this.state == State.Off){
            this.startOs();
            this.state = State.On;
        } else {
            this.state = State.Off;
            this.stopOs();

        }
    }
    private void startOs() {
            System.out.println("Hi");
    }
    private void stopOs() {
            System.out.println("Bye");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("name: %s level= %d\n", this.name, this.level);
    }
}
