package colourmapper;

import static org.junit.Assert.*;
import org.junit.Test;
import colourmapper.MajorColour;

public class MajorColourTest {

    @Test
    public void testFromIndexValid() {
        for (MajorColour color : MajorColour.values()) {
            assertEquals(color, MajorColour.fromIndex(color.getIndex()));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromIndexInvalidNegative() {
        MajorColour.fromIndex(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromIndexInvalidTooLarge() {
        MajorColour.fromIndex(100);
    }

    @Test
    public void testGetIndexAndGetName() {
        MajorColour color = MajorColour.RED;
        assertEquals(1, color.getIndex());
        assertEquals("Red", color.getName());
    }

    @Test
    public void testToString() {
        MajorColour color = MajorColour.BLACK;
        assertEquals("Black", color.toString());
    }
}

