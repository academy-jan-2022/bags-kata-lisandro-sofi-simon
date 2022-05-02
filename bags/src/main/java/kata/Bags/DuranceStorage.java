package kata.Bags;

import java.util.ArrayList;

public class DuranceStorage {

    private ArrayList<String> items = new ArrayList<>();

    public ArrayList<String> add(String item) {
        if (items.size() < 8) items.add(item);
        return items;
    }

    public ArrayList<String> getAllItems() {
        return items;
    }
}
