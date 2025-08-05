package colourmapper;

public final class ColourPairMapper {
    private static final int NUMBER_OF_MAJOR_COLORS = MajorColour.values().length;
    private static final int NUMBER_OF_MINOR_COLORS = MinorColour.values().length;

    private ColourPairMapper() {
    }

    public static ColourPair getColorFromPairNumber(int pairNumber) {
        if (pairNumber <= 0 || pairNumber > NUMBER_OF_MAJOR_COLORS * NUMBER_OF_MINOR_COLORS) {
            throw new IllegalArgumentException("Invalid pair number: " + pairNumber);
        }

        int zeroBasedPairNumber = pairNumber - 1;

        MajorColour majorColor = MajorColour.fromIndex(zeroBasedPairNumber / NUMBER_OF_MINOR_COLORS);
        MinorColour minorColor = MinorColour.fromIndex(zeroBasedPairNumber % NUMBER_OF_MINOR_COLORS);

        return new ColourPair(majorColor, minorColor);
    }

    public static int getPairNumberFromColor(MajorColour major, MinorColour minor) {
        if (major == null || minor == null) {
            throw new IllegalArgumentException("Colors cannot be null");
        }

        return major.getIndex() * NUMBER_OF_MINOR_COLORS + minor.getIndex() + 1;
    }
}

