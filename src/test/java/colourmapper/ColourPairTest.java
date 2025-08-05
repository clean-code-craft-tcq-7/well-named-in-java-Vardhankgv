package colourmapper;

import static org.junit.Assert.*;
import org.junit.Test;
import colourmapper.ColourPair;

public class ColourPairTest {

    @Test
    public void testConstructorAndGetters() {
        ColourPair pair = new ColourPair(MajorColour.YELLOW, MinorColour.GREEN);
        assertEquals(MajorColor.YELLOW, pair.getMajorColor());
        assertEquals(MinorColor.GREEN, pair.getMinorColor());
    }

    @Test
    public void testToString() {
        ColourPair pair = new ColourPair(MajorColour.VIOLET, MinorColour.SLATE);
        assertEquals("Violet Slate", pair.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullMajorThrows() {
        new ColourPair(null, MinorColour.BLUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullMinorThrows() {
        new ColourPair(MajorColour.RED, null);
    }
}

