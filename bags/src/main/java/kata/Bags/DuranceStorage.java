package kata.Bags;

import java.util.ArrayList;

public class DuranceStorage {

    private ArrayList<String> items = new ArrayList<>();

    public ArrayList<String> add(String item) {
        items.add(item);
        return items;
    }
}
