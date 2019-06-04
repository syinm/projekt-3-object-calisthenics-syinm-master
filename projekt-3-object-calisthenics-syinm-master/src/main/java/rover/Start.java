package rover;

import java.io.PrintStream;
public class Start {

    public static void main(String[] args) {


        Mars mars = new Mars();
        Rover rover = new Rover();
        mars.createField(rover);

        PrintStream out = System.out;
        // Initial Mars
        mars.print(out, mars);

        /*  .moveForward(Mars) to move       */
        /*  .turnRight(Mars) to turn right   */
        /*  Mars.print(out) to see mars      */

        rover.moveForward(mars);
        rover.moveForward(mars);
        rover.moveForward(mars);
        mars.print(out, mars);
        rover.turnRight(mars);
        rover.turnRight(mars);
        rover.turnRight(mars);
        rover.moveForward(mars);
        rover.moveForward(mars);
        rover.moveForward(mars);
        mars.print(out, mars);
        rover.turnRight(mars);
        rover.turnRight(mars);
        rover.turnRight(mars);
        rover.moveForward(mars);
        rover.moveForward(mars);
        rover.moveForward(mars);
        mars.print(out, mars);
        rover.turnRight(mars);
        rover.turnRight(mars);
        rover.turnRight(mars);
        rover.moveForward(mars);
        rover.moveForward(mars);
        rover.moveForward(mars);
        mars.print(out, mars);
    }
}