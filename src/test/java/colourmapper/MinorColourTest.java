package colourmapper;

import static org.junit.Assert.*;
import org.junit.Test;
import colourmapper.MinorColour;

public class MinorColourTest {

    @Test
    public void testFromIndexValid() {
        for (MinorColour color : MinorColour.values()) {
            assertEquals(color, MinorColour.fromIndex(color.getIndex()));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromIndexInvalidNegative() {
        MinorColour.fromIndex(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromIndexInvalidTooLarge() {
        MinorColour.fromIndex(100);
    }

    @Test
    public void testGetIndexAndGetName() {
        MinorColour color = MinorColour.ORANGE;
        assertEquals(1, color.getIndex());
        assertEquals("Orange", color.getName());
    }

    @Test
    public void testToString() {
        MinorColour color = MinorColour.BROWN;
        assertEquals("Brown", color.toString());
    }
}

