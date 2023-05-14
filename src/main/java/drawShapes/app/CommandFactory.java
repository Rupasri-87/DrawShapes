package drawShapes.app;

import drawShapes.draw.*;
import drawShapes.exception.InvalidInputException;
import drawShapes.model.CommandInput;

public class CommandFactory {

    public final AbstractCommand getCommand(CommandInput input) throws InvalidInputException {
        AbstractCommand command;
        switch (input.getCommand()) {
            case CANVAS:
                command = new Canvas();
                break;
            case LINE:
                command = new Line();
                break;
            case RECTANGLE:
                command = new Rectangle();
                break;
            case QUIT:
                command = new Quit();
                break;
            default:
                throw new InvalidInputException("Invalid command!");
        }
        return command;
    }
}
