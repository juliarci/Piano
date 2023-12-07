package pianoInterface;

import java.util.HashMap;
import java.util.TreeMap;

public class Notes {

    private TreeMap<Integer, String> notes;

    public Notes() {
        this.notes = new TreeMap<>();
        notes.put(60,"DO4");
        notes.put(62, "RE");
        notes.put(64, "MI");
        notes.put(65, "FA");
        notes.put(67,"SOL");
        notes.put(69, "LA");
        notes.put(71, "SI");
        notes.put(72, "DO5");
    }

    public TreeMap<Integer, String> getNotes() {
        return notes;
    }

    public void setNotes(TreeMap<Integer, String> notes) {
        this.notes = notes;
    }
}
