package colourmapper;

import static org.junit.Assert.*;
import org.junit.Test;
import colourmapper.ColourPairMapping;

public class ColourPairMapperTest {

    @Test
    public void testGetColorFromPairNumber_ValidPairs() {
        int totalPairs = MajorColor.values().length * MinorColor.values().length;

        for (int pairNumber = 1; pairNumber <= totalPairs; pairNumber++) {
            ColorPair pair = ColorPairMapper.getColorFromPairNumber(pairNumber);
            int calculatedPairNumber = ColorPairMapper.getPairNumberFromColor(pair.getMajorColor(), pair.getMinorColor());
            assertEquals("Round-trip failed for pairNumber " + pairNumber, pairNumber, calculatedPairNumber);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetColorFromPairNumber_InvalidLowZero() {
        ColorPairMapper.getColorFromPairNumber(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetColorFromPairNumber_InvalidLowNegative() {
        ColorPairMapper.getColorFromPairNumber(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetColorFromPairNumber_InvalidHigh() {
        int totalPairs = MajorColor.values().length * MinorColor.values().length;
        ColorPairMapper.getColorFromPairNumber(totalPairs + 1);
    }

    @Test
    public void testGetPairNumberFromColor_Valid() {
        for (MajorColor major : MajorColor.values()) {
            for (MinorColor minor : MinorColor.values()) {
                int pairNumber = ColorPairMapper.getPairNumberFromColor(major, minor);
                assertTrue(pairNumber > 0);
            }
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPairNumberFromColor_NullMajor() {
        ColorPairMapper.getPairNumberFromColor(null, MinorColor.BLUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPairNumberFromColor_NullMinor() {
        ColorPairMapper.getPairNumberFromColor(MajorColor.WHITE, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPairNumberFromColor_BothNull() {
        ColorPairMapper.getPairNumberFromColor(null, null);
    }
}

