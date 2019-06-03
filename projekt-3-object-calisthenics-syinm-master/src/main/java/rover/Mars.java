package rover;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;

class Mars {


    Fieldsize field = new Fieldsize(10, 20);
    String[][] mars = new String[field.fieldhight][field.fieldwidth];
    private Coordinate coordinate = new Coordinate(0, 0);
    private Counter counter = new Counter(field.fieldhight * field.fieldwidth);

    void createField(Rover rover) {
        counter.counter = 0;
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
        if (coordinate.hight == field.fieldhight) {
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

    void printTest() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print(mars[j][i]);
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    void print(PrintStream out) {
       /* for (coordinate2.width = 0; counter2.counter < counter2.countermax; coordinate2.width++) {
            counter2.counter++;
            changeRow(); */
        out.print(Arrays.deepToString(mars));
        System.out.println();
        //    out.println(new String[]{mars[coordinate2.width][counter2.counter]});
    }

}

