package misc;

import rover.Coordinate;
import rover.Fieldsize;
import rover.Mars;

import java.io.PrintStream;

public class Print {

    Fieldsize field = new Fieldsize(10, 20);

    private Coordinate coordinatePrint = new Coordinate(0, 0);
    private Counter counterPrint = new Counter(field.fieldhight * field.fieldwidth);

    public void print(PrintStream out, Mars mars) {
        setToZero();
        for (coordinatePrint.width = 0; counterPrint.counter < counterPrint.countermax; coordinatePrint.width++) {
            counterPrint.counter++;
            changeRowPrint(out);
            out.print(mars.mars[coordinatePrint.hight][coordinatePrint.width]);
        }
        out.println();
        out.println("--------------------");
    }

    private void setToZero() {
        coordinatePrint = new Coordinate(0, 0);
        counterPrint = new Counter(field.fieldhight * field.fieldwidth);
    }

    private void changeRowPrint(PrintStream out) {
        if (coordinatePrint.width == field.fieldwidth) {
            coordinatePrint.width = 0;
            coordinatePrint.hight++;
            out.println();
        }
    }
}
