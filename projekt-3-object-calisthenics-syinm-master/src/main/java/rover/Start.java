package rover;

import java.io.PrintStream;

public class Start {

    public static void main(String[] args) {

        Mars mars = new Mars();
        Rover rover = new Rover();
        mars.createField(rover);

        PrintStream out = System.out;
        //   mars.print(out);
        System.out.println("Initial:");
        mars.printTest();


        rover.moveForward(mars);
        rover.moveForward(mars);
        rover.moveForward(mars);
        System.out.println("1 move");
        mars.printTest();

        rover.turnRight(mars);
        rover.turnRight(mars);
        rover.turnRight(mars);
        rover.moveForward(mars);
        rover.moveForward(mars);
        rover.moveForward(mars);
        System.out.println("2 move");
        mars.printTest();
        rover.turnRight(mars);
        rover.turnRight(mars);
        rover.turnRight(mars);
        rover.moveForward(mars);
        rover.moveForward(mars);
        rover.moveForward(mars);
        System.out.println("3 move");
        mars.printTest();
        rover.turnRight(mars);
        rover.turnRight(mars);
        rover.turnRight(mars);
        rover.moveForward(mars);
        rover.moveForward(mars);
        rover.moveForward(mars);
        System.out.println("4 move");
        mars.printTest();

    }
}