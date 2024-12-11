package sport.participants;

public class Participant {
    private String name;
    private int limitRun;
    private int limitJump;

    public Participant(String name, int limitRun, int limitJump) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    public boolean run(int length, String obstacleName) {
        if (length <= limitRun) {
            System.out.println("Participant " + getName() + " run " + obstacleName + " with " + length);
            return true;
        } else {
            System.out.println("Participant " + getName() + " not run " + obstacleName + " with " + length + ".");
            System.out.println("Have run " + limitRun);
            return false;
        }

    }

    public boolean jump(int height, String obstacleName) {
        if (height <= limitJump) {
            System.out.println("Participant " + getName() + " jump " + obstacleName + " with " + height);
            return true;
        } else {
            System.out.println("Participant " + getName() + " not jump " + obstacleName + " with " + height + ".");
            System.out.println("Have jump " + limitJump);
            return false;
        }

    }

    public String getName() {
        return name;
    }
}

