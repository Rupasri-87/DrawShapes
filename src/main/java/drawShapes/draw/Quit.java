package drawShapes.draw;

import drawShapes.exception.InvalidInputException;

import java.util.List;

public class Quit extends AbstractCommand {

    @Override
    public void execute(final List<String> params) throws InvalidInputException {
        System.exit(0);
    }
}