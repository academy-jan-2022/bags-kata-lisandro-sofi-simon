package kata.Bags;

import java.util.ArrayList;
import java.util.Collections;

public class Bag {

    ArrayList<String> items = new ArrayList<>();

    public ArrayList<String> getAllItems() {
     return items;
    }

    public void add(String item) {
        if (items.size() < 4) {
            items.add(item);
        }
    }

    public void sortItemsAlphabetically() {
        Collections.sort(items);
    }
}
