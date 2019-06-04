package rover;


import misc.ArrayCheck;

class Rover {

    Coordinate roverPosition = new Coordinate(9, 10);
    Direction dircetion = new Direction("north");

    private void moveNorth(Mars mars) {
        if (new ArrayCheck().checkArrayNorth(mars, roverPosition) && new Stone().checkStoneNorth(mars, roverPosition)) {
            new Mars().deleteOldRoverPosition(mars.mars, roverPosition);
            roverPosition.hight--;
            new Mars().newRoverPositionNorth(mars, roverPosition);
        }
    }

    private void moveEast(Mars mars) {
        if (new ArrayCheck().checkArrayEast(mars, roverPosition) && new Stone().checkStoneEast(mars, roverPosition)) {
            new Mars().deleteOldRoverPosition(mars.mars, roverPosition);
            roverPosition.width++;
            new Mars().newRoverPositionEast(mars, roverPosition);
        }
    }

    private void moveSouth(Mars mars) {
        if (new ArrayCheck().checkArraySouth(mars, roverPosition) && new Stone().checkStoneSouth(mars, roverPosition)) {
            new Mars().deleteOldRoverPosition(mars.mars, roverPosition);
            roverPosition.hight++;
            new Mars().newRoverPositionSouth(mars, roverPosition);
        }
    }

    private void moveWest(Mars mars) {
        if (new ArrayCheck().checkArrayWest(mars, roverPosition) && new Stone().checkStoneWest(mars, roverPosition)) {
            new Mars().deleteOldRoverPosition(mars.mars, roverPosition);
            roverPosition.width--;
            new Mars().newRoverPositionWest(mars, roverPosition);
        }
    }

    void turnRight(Mars mars) {
        if (dircetion.direction.equals("north")) {
            new Mars().roverFaceEast(mars, roverPosition);
            dircetion.direction = "east";
        } else if (dircetion.direction.equals("east")) {
            new Mars().roverFaceSouth(mars, roverPosition);
            dircetion.direction = "south";
        } else if (dircetion.direction.equals("south")) {
            new Mars().roverFaceWest(mars, roverPosition);
            dircetion.direction = "west";
        } else if (dircetion.direction.equals("west")) {
            new Mars().roverFaceNorth(mars, roverPosition);
            dircetion.direction = "north";
        }
    }

    void moveForward(Mars mars) {
        if (dircetion.direction.equals("north"))
            moveNorth(mars);
        else if (dircetion.direction.equals("east"))
            moveEast(mars);
        else if (dircetion.direction.equals("south"))
            moveSouth(mars);
        else if (dircetion.direction.equals("west"))
            moveWest(mars);
    }
}


