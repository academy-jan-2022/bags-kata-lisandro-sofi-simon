package kata.Bags;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BagShould {

    private Bag bag;
    private ArrayList<String> expected;

    @BeforeEach
    void setUp() {
        expected = new ArrayList<>();
        bag = new Bag();

    }

    @Test void
    get_empty_bag_if_no_items_where_added(){
        ArrayList<String> result = bag.getAllItems();
        assertThat(result, equalTo(expected));
    }
    @Test void
    get_one_item_bag_if_one_item_where_added(){
        expected.add("Axe");
        bag.add("Axe");

        ArrayList<String> result = bag.getAllItems();

        assertThat(result, equalTo(expected));
    }

    @Test void
    get_four_item_bag_if_five_item_where_added(){
        expected.add("Axe");
        expected.add("Axe");
        expected.add("Axe");
        expected.add("Axe");

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
        expected.add("Axe");
        expected.add("Hammer");


        bag.add("Axe");

        bag.sortItemsAlphabetically();

        ArrayList<String> items = bag.getAllItems();

        assertThat(items, equalTo(expected));
    }
}
