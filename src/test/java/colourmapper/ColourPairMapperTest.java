package colourmapper;

import static org.junit.Assert.*;
import org.junit.Test;
import colourmapper.ColourPairMapper;
import colourmapper.MajorColour;
import colourmapper.MinorColour;
import colourmapper.ColourPair;

public class ColourPairMapperTest {

    @Test
    public void testGetColorFromPairNumber_ValidPairs() {
        int totalPairs = MajorColour.values().length * MinorColour.values().length;

        for (int pairNumber = 1; pairNumber <= totalPairs; pairNumber++) {
            ColourPair pair = ColourPairMapper.getColorFromPairNumber(pairNumber);
            int calculatedPairNumber = ColorPairMapper.getPairNumberFromColor(pair.getMajorColor(), pair.getMinorColor());
            assertEquals("Round-trip failed for pairNumber " + pairNumber, pairNumber, calculatedPairNumber);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetColorFromPairNumber_InvalidLowZero() {
        ColourPairMapper.getColorFromPairNumber(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetColorFromPairNumber_InvalidLowNegative() {
        ColourPairMapper.getColorFromPairNumber(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetColorFromPairNumber_InvalidHigh() {
        int totalPairs = MajorColour.values().length * MinorColour.values().length;
        ColourPairMapper.getColorFromPairNumber(totalPairs + 1);
    }

    @Test
    public void testGetPairNumberFromColor_Valid() {
        for (MajorColour major : MajorColour.values()) {
            for (MinorColour minor : MinorColour.values()) {
                int pairNumber = ColourPairMapper.getPairNumberFromColor(major, minor);
                assertTrue(pairNumber > 0);
            }
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPairNumberFromColor_NullMajor() {
        ColourPairMapper.getPairNumberFromColor(null, MinorColour.BLUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPairNumberFromColor_NullMinor() {
        ColourPairMapper.getPairNumberFromColor(MajorColour.WHITE, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPairNumberFromColor_BothNull() {
        ColourPairMapper.getPairNumberFromColor(null, null);
    }
}

