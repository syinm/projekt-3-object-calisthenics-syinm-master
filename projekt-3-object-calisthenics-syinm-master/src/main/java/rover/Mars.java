package rover;

import misc.Counter;
import misc.Print;

import java.io.PrintStream;
import java.util.Random;

public class Mars {

    public Fieldsize fieldsize = new Fieldsize(10, 20);
    public String[][] mars = new String[fieldsize.fieldhight][fieldsize.fieldwidth];
    Coordinate coordinate = new Coordinate(0, 0);

    void createField(Rover rover) {
        Counter counter = new Counter(fieldsize.fieldhight * fieldsize.fieldwidth);
        for (coordinate.hight = 0; counter.counter < counter.countermax; coordinate.hight++) {
            counter.counter++;
            changeRow();
            setFreeSpace();
            setStones();
        }
        setRover(rover);
    }

    private void setRover(Rover rover) {
        mars[rover.roverPosition.hight][rover.roverPosition.width] = "^";
    }

    private void setFreeSpace() {
        mars[coordinate.hight][coordinate.width] = " ";
    }

    private void changeRow() {
        if (coordinate.hight == fieldsize.fieldhight) {
            coordinate.hight = 0;
            coordinate.width++;
        }
    }

    private void setStones() {
        Random rnd = new Random();
        int x = rnd.nextInt(100 + 1);
        if (x < 30) mars[coordinate.hight][coordinate.width] = "o";
    }

    void newRoverPositionNorth(Mars mars, Coordinate rover) {
        mars.mars[rover.hight][rover.width] = "^";
    }

    void newRoverPositionEast(Mars mars, Coordinate rover) {
        mars.mars[rover.hight][rover.width] = ">";
    }

    void newRoverPositionSouth(Mars mars, Coordinate rover) {
        mars.mars[rover.hight][rover.width] = "v";
    }

    void newRoverPositionWest(Mars mars, Coordinate rover) {
        mars.mars[rover.hight][rover.width] = "<";
    }

    void deleteOldRoverPosition(String[][] mars, Coordinate rover) {
        mars[rover.hight][rover.width] = " ";
    }

    void roverFaceEast(Mars mars, Coordinate rover) {
        mars.mars[rover.hight][rover.width] = ">";
    }

    void roverFaceSouth(Mars mars, Coordinate rover) {
        mars.mars[rover.hight][rover.width] = "v";
    }

    void roverFaceWest(Mars mars, Coordinate rover) {
        mars.mars[rover.hight][rover.width] = "<";
    }

    void roverFaceNorth(Mars mars, Coordinate rover) {
        mars.mars[rover.hight][rover.width] = "^";
    }

    void print(PrintStream out, Mars mars) {
        new Print().print(out, mars);
    }
}
