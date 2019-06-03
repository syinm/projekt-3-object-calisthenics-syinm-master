package rover;


class Rover {

    Coordinate roverPosition = new Coordinate(9, 9);

    private void moveNorth(Mars mars) {
        if (checkArrayNorth(mars) && checkStoneNorth(mars)) {
            new Mars().deleteOldRoverPosition(mars.mars, roverPosition);
            roverPosition.hight--;
            new Mars().newRoverPositionNorth(mars, roverPosition);
        }
    }

    private void moveEast(Mars mars) {
        if (checkArrayEast(mars) && checkStoneEast(mars)) {
            new Mars().deleteOldRoverPosition(mars.mars, roverPosition);
            roverPosition.width++;
            new Mars().newRoverPositionEast(mars, roverPosition);
        }
    }

    private void moveSouth(Mars mars) {
        if (checkArraySouth(mars) && checkStoneSouth(mars)) {
            new Mars().deleteOldRoverPosition(mars.mars, roverPosition);
            roverPosition.hight++;
            new Mars().newRoverPositionSouth(mars, roverPosition);
        }
    }

    private void moveWest(Mars mars) {
        if (checkArrayWest(mars) && checkStoneWest(mars)) {
            new Mars().deleteOldRoverPosition(mars.mars, roverPosition);
            roverPosition.width--;
            new Mars().newRoverPositionWest(mars, roverPosition);
        }
    }

    private boolean checkStoneNorth(Mars mars) {
        return mars.mars[(roverPosition.hight) - 1][roverPosition.width].equals(" ");
    }

    private boolean checkStoneEast(Mars mars) {
        return mars.mars[roverPosition.hight][(roverPosition.width) + 1].equals(" ");
    }

    private boolean checkStoneSouth(Mars mars) {
        return mars.mars[(roverPosition.hight) + 1][roverPosition.width].equals(" ");
    }

    private boolean checkStoneWest(Mars mars) {
        return mars.mars[roverPosition.hight][(roverPosition.width) - 1].equals(" ");
    }

    private boolean checkArrayNorth(Mars mars) {
        return ((roverPosition.hight) - 1 < mars.field.fieldhight);
    }

    private boolean checkArrayEast(Mars mars) {
        return ((roverPosition.width) + 1 < mars.field.fieldwidth);
    }

    private boolean checkArraySouth(Mars mars) {
        return ((roverPosition.hight) + 1 < mars.field.fieldhight);
    }

    private boolean checkArrayWest(Mars mars) {
        return ((roverPosition.width) - 1 < mars.field.fieldwidth);
    }

    void turnRight(Mars mars) {
        if ("^".equals(mars.mars[roverPosition.hight][roverPosition.width]))
            new Mars().roverFaceEast(mars, roverPosition);
        else if (">".equals(mars.mars[roverPosition.hight][roverPosition.width]))
            new Mars().roverFaceSouth(mars, roverPosition);
        else if ("v".equals(mars.mars[roverPosition.hight][roverPosition.width]))
            new Mars().roverFaceWest(mars, roverPosition);
        else if ("<".equals(mars.mars[roverPosition.hight][roverPosition.width]))
            new Mars().roverFaceNorth(mars, roverPosition);
    }

    void moveForward(Mars mars) {
        if ("^".equals(mars.mars[roverPosition.hight][roverPosition.width]))
            moveNorth(mars);
        else if (">".equals(mars.mars[roverPosition.hight][roverPosition.width]))
            moveEast(mars);
        else if ("v".equals(mars.mars[roverPosition.hight][roverPosition.width]))
            moveSouth(mars);
        else if ("<".equals(mars.mars[roverPosition.hight][roverPosition.width]))
            moveWest(mars);
    }
}


