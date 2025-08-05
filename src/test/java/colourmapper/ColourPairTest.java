package colourmapper;

import static org.junit.Assert.*;
import org.junit.Test;
import colourmapper.ColourPair;

public class ColourPairTest {

    @Test
    public void testConstructorAndGetters() {
        ColorPair pair = new ColorPair(MajorColor.YELLOW, MinorColor.GREEN);
        assertEquals(MajorColor.YELLOW, pair.getMajorColor());
        assertEquals(MinorColor.GREEN, pair.getMinorColor());
    }

    @Test
    public void testToString() {
        ColorPair pair = new ColorPair(MajorColor.VIOLET, MinorColor.SLATE);
        assertEquals("Violet Slate", pair.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullMajorThrows() {
        new ColorPair(null, MinorColor.BLUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullMinorThrows() {
        new ColorPair(MajorColor.RED, null);
    }
}

