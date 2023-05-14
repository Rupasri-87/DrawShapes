package drawShapes.draw;

import drawShapes.exception.InvalidInputException;

import java.util.List;

public interface Command {
    public void execute(List<String> params) throws InvalidInputException;
}