package kata.Bags;

import java.util.ArrayList;

public class Bag {

    ArrayList<String> items = new ArrayList<String>();

    public ArrayList<String> getAllItems() {
     return items;
    }

    public void add(String item) {
        items.add(item);
    }
}
