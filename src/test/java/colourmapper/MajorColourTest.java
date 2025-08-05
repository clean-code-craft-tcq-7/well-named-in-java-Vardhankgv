package colourmapper;

import static org.junit.Assert.*;
import org.junit.Test;
import colourmapper.MajorColour;

public class MajorColourTest {

    @Test
    public void testFromIndexValid() {
        for (MajorColor color : MajorColor.values()) {
            assertEquals(color, MajorColor.fromIndex(color.getIndex()));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromIndexInvalidNegative() {
        MajorColor.fromIndex(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromIndexInvalidTooLarge() {
        MajorColor.fromIndex(100);
    }

    @Test
    public void testGetIndexAndGetName() {
        MajorColor color = MajorColor.RED;
        assertEquals(1, color.getIndex());
        assertEquals("Red", color.getName());
    }

    @Test
    public void testToString() {
        MajorColor color = MajorColor.BLACK;
        assertEquals("Black", color.toString());
    }
}

