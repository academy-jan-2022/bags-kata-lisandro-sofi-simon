package kata.Bags;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BagShould {
    @Test void
    get_empty_bag_if_no_items_where_added(){
        ArrayList<String> expected = new ArrayList<>();
        Bag bag = new Bag();
        ArrayList<String> result = bag.getAllItems();
        assertThat(result, equalTo(expected));
    }
    @Test void
    get_one_item_bag_if_one_item_where_added(){
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Axe");
        Bag bag = new Bag();
        bag.add("Axe");
        ArrayList<String> result = bag.getAllItems();
        assertThat(result, equalTo(expected));
    }

    @Test void
    get_four_item_bag_if_five_item_where_added(){
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Axe");
        expected.add("Axe");
        expected.add("Axe");
        expected.add("Axe");

        Bag bag = new Bag();
        bag.add("Axe");
        bag.add("Axe");
        bag.add("Axe");
        bag.add("Axe");
        bag.add("Axe");

        ArrayList<String> result = bag.getAllItems();
        assertThat(result, equalTo(expected));
    }

    @Test void
    order_items_alphabetically(){
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Axe");
        expected.add("Hammer");

        Bag bag = new Bag();
        bag.add("Hammer");
        bag.add("Axe");

        bag.sortItemsAlphabetically();

        ArrayList<String> items = bag.getAllItems();

        assertThat(items, equalTo(expected));
    }
}
