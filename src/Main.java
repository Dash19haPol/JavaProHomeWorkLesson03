import figures.Area;
import figures.impl.Circle;
import figures.impl.Square;
import figures.impl.Triangle;
import sport.obstracles.Obstacle;
import sport.obstracles.impl.Racetrack;
import sport.obstracles.impl.Wall;
import sport.participants.Participant;
import sport.participants.impl.Cat;
import sport.participants.impl.Human;
import sport.participants.impl.Robot;

public class Main {

    public static void main(String[] args) {
        processAreas();

        System.out.println();

        runAndJump();

    }


    private static void runAndJump() {
        Participant human = new Human("Alex", 400, 10);
        Participant cat = new Cat("Tom", 600, 20);
        Participant robot = new Robot("Max", 1000, 5);

        Participant[] participants = new Participant[]{human, cat, robot};

        Obstacle[] obstacles = new Obstacle[]{
                new Racetrack(500),
                new Wall(10)
        };

        for (Participant participant : participants){
            for (Obstacle obstacle : obstacles){
                if (!obstacle.overcome(participant)){
                    break;
                }
            }
        }
    }

    private static void processAreas() {
        Area[] areas = new Area[]{
                new Circle(7),
                new Triangle(5, 8),
                new Square(10)
        };

        double sumArea = getTotalArea(areas);
        System.out.println("The total area of all figures is " + sumArea);
    }

    public static double getTotalArea (Area[]areas){
        double sum = 0;
        for (Area figure : areas) {
            sum += figure.calculateTheArea();
        }
        return sum;
    }
}

