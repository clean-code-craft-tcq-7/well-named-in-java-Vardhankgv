package colourmapper;

public enum MinorColour {
    BLUE(0, "Blue"),
    ORANGE(1, "Orange"),
    GREEN(2, "Green"),
    BROWN(3, "Brown"),
    SLATE(4, "Slate");

    private final int index;
    private final String name;

    MinorColour(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    private static final MinorColour[] INDEX_MAP = new MinorColour[values().length];

    static {
        for (MinorColour color : values()) {
            INDEX_MAP[color.getIndex()] = color;
        }
    }

    public static MinorColour fromIndex(int index) {
        if (index < 0 || index >= INDEX_MAP.length) {
            throw new IllegalArgumentException("Invalid MinorColor index: " + index);
        }
        return INDEX_MAP[index];
    }

    @Override
    public String toString() {
        return name;
    }
}

