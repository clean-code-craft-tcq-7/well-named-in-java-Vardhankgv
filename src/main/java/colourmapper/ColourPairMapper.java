package colourmapper;

public final class ColourPairMapper {
    private static final int NUMBER_OF_MAJOR_COLORS = MajorColor.values().length;
    private static final int NUMBER_OF_MINOR_COLORS = MinorColor.values().length;

    private ColourPairMapper() {
    }

    public static ColorPair getColorFromPairNumber(int pairNumber) {
        if (pairNumber <= 0 || pairNumber > NUMBER_OF_MAJOR_COLORS * NUMBER_OF_MINOR_COLORS) {
            throw new IllegalArgumentException("Invalid pair number: " + pairNumber);
        }

        int zeroBasedPairNumber = pairNumber - 1;

        MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / NUMBER_OF_MINOR_COLORS);
        MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % NUMBER_OF_MINOR_COLORS);

        return new ColorPair(majorColor, minorColor);
    }

    public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
        if (major == null || minor == null) {
            throw new IllegalArgumentException("Colors cannot be null");
        }

        return major.getIndex() * NUMBER_OF_MINOR_COLORS + minor.getIndex() + 1;
    }
}

