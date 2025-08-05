package colourmapper;

public final class ColourPair {
    private final MajorColour majorColor;
    private final MinorColour minorColor;

    public ColourPair(MajorColour majorColor, MinorColour minorColor) {
        if (majorColor == null || minorColor == null) {
            throw new IllegalArgumentException("Colors cannot be null");
        }
        this.majorColor = majorColor;
        this.minorColor = minorColor;
    }

    public MajorColour getMajorColor() {
        return majorColor;
    }

    public MinorColour getMinorColor() {
        return minorColor;
    }

    @Override
    public String toString() {
        return majorColor.toString() + " " + minorColor.toString();
    }
}

