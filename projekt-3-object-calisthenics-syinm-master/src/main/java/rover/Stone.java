package rover;

class Stone {

     boolean checkStoneNorth(Mars mars, Coordinate roverPosition) {
        return mars.mars[(roverPosition.hight) - 1][roverPosition.width].equals(" ");
    }
     boolean checkStoneEast(Mars mars, Coordinate roverPosition) {
        return mars.mars[roverPosition.hight][(roverPosition.width) + 1].equals(" ");
    }
     boolean checkStoneSouth(Mars mars, Coordinate roverPosition) {
        return mars.mars[(roverPosition.hight) + 1][roverPosition.width].equals(" ");
    }
     boolean checkStoneWest(Mars mars, Coordinate roverPosition) {
        return mars.mars[roverPosition.hight][(roverPosition.width) - 1].equals(" ");
    }

}
