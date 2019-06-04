package misc;

import rover.Coordinate;
import rover.Mars;

public class ArrayCheck {


    public boolean checkArrayNorth(Mars mars, Coordinate roverPosition) {
        return ((roverPosition.hight) - 1 < mars.fieldsize.fieldhight);
    }

    public boolean checkArrayEast(Mars mars, Coordinate roverPosition) {
        return ((roverPosition.width) + 1 < mars.fieldsize.fieldwidth);
    }

    public boolean checkArraySouth(Mars mars, Coordinate roverPosition) {
        return ((roverPosition.hight) + 1 < mars.fieldsize.fieldhight);
    }

    public boolean checkArrayWest(Mars mars, Coordinate roverPosition) {
        return ((roverPosition.width) - 1 < mars.fieldsize.fieldwidth);
    }
}
