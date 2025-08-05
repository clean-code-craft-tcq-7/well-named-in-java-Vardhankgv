package colourmapper;

import static org.junit.Assert.*;
import org.junit.Test;
import colourmapper.ColourPair;

public class ColourPairTest {

    @Test
    public void testConstructorAndGetters() {
        ColourPair pair = new ColourPair(MajorColour.YELLOW, MinorColour.GREEN);
        assertEquals(MajorColour.YELLOW, pair.getMajorColor());
        assertEquals(MinorColour.GREEN, pair.getMinorColor());
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

