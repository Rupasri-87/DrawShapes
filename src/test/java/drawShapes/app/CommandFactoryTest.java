package drawShapes.app;

import drawShapes.draw.*;
import drawShapes.exception.InvalidInputException;
import drawShapes.model.CommandInput;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class CommandFactoryTest {

    @Test
    public void testGetCommand() throws InvalidInputException {
        CommandFactory factory = new CommandFactory();
        CommandInput input = new CommandInput("C 20 10");
        AbstractCommand command = factory.getCommand(input);

        assertTrue(command instanceof Canvas);

        input = new CommandInput("L 2 10 2 5");
        command = factory.getCommand(input);

        assertTrue(command instanceof Line);

        input = new CommandInput("R 2 5 12 8");
        command = factory.getCommand(input);

        assertTrue(command instanceof Rectangle);

        input = new CommandInput("Q");
        command = factory.getCommand(input);

        assertTrue(command instanceof Quit);
    }
}
