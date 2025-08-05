package colourmapper;

public final class ColourPair {
    private final MajorColor majorColor;
    private final MinorColor minorColor;

    public ColourPair(MajorColor majorColor, MinorColor minorColor) {
        if (majorColor == null || minorColor == null) {
            throw new IllegalArgumentException("Colors cannot be null");
        }
        this.majorColor = majorColor;
        this.minorColor = minorColor;
    }

    public MajorColor getMajorColor() {
        return majorColor;
    }

    public MinorColor getMinorColor() {
        return minorColor;
    }

    @Override
    public String toString() {
        return majorColor.toString() + " " + minorColor.toString();
    }
}

