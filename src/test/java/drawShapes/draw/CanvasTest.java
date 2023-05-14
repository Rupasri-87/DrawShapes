package drawShapes.draw;

import drawShapes.exception.InvalidInputException;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CanvasTest {

    @Test
    public void testExecute() throws InvalidInputException {
        Canvas canvas = new Canvas();

        List<String> params = new ArrayList<>();
        params.add("5");
        params.add("3");

        char[][] expected = { { '-', '-', '-', '-', '-' }, { '|', 0, 0, 0, '|' }, { '|', 0, 0, 0, '|' },
                { '|', 0, 0, 0, '|' }, { '-', '-', '-', '-', '-' } };
        canvas.execute(params);

        assertTrue(canvas.shape != null);
        assertTrue(canvas.height == 3);
        assertTrue(canvas.width == 5);

        assertEquals(Arrays.deepToString(canvas.shape), Arrays.deepToString(expected));
    }

    @Test
    public void testExecuteWhenInSufficientParams() throws InvalidInputException {
        Canvas canvas = new Canvas();

        List<String> params = new ArrayList<>();
        params.add("5");
        assertThrows(InvalidInputException.class, () -> {
            canvas.execute(params);
        });
    }
}

