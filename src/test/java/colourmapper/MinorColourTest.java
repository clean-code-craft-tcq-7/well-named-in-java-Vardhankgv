package colourmapper;

import static org.junit.Assert.*;
import org.junit.Test;
import colourmapper.MinorColour;

public class MinorColourTest {

    @Test
    public void testFromIndexValid() {
        for (MinorColor color : MinorColor.values()) {
            assertEquals(color, MinorColor.fromIndex(color.getIndex()));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromIndexInvalidNegative() {
        MinorColor.fromIndex(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromIndexInvalidTooLarge() {
        MinorColor.fromIndex(100);
    }

    @Test
    public void testGetIndexAndGetName() {
        MinorColor color = MinorColor.ORANGE;
        assertEquals(1, color.getIndex());
        assertEquals("Orange", color.getName());
    }

    @Test
    public void testToString() {
        MinorColor color = MinorColor.BROWN;
        assertEquals("Brown", color.toString());
    }
}

