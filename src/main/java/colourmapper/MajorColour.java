package colourmapper;

public enum MajorColour {
 WHITE(0, "White"),
 RED(1, "Red"),
 BLACK(2, "Black"),
 YELLOW(3, "Yellow"),
 VIOLET(4, "Violet");

 private final int index;
 private final String name;

 MajorColour(int index, String name) {
     this.index = index;
     this.name = name;
 }

 public int getIndex() {
     return index;
 }

 public String getName() {
     return name;
 }

 private static final MajorColour[] INDEX_MAP = new MajorColour[values().length];

 static {
     for (MajorColour color : values()) {
         INDEX_MAP[color.getIndex()] = color;
     }
 }

 public static MajorColour fromIndex(int index) {
     if (index < 0 || index >= INDEX_MAP.length) {
         throw new IllegalArgumentException("Invalid MajorColor index: " + index);
     }
     return INDEX_MAP[index];
 }

 @Override
 public String toString() {
     return name;
 }
}

