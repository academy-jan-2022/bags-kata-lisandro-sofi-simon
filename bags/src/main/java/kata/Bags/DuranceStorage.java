package kata.Bags;

import java.util.ArrayList;

public class DuranceStorage {

    private final ArrayList<String> items = new ArrayList<>();

    public void add(String item) {
        if (items.size() < 8) items.add(item);
    }

    public ArrayList<String> getAllItems() {
        return items;
    }
}
