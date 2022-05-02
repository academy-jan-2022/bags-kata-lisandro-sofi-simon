package kata.Bags;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BagShould {

    private Bag bag;
    private ArrayList<String> expected;
    private final String FIRST_ITEM = "Axe";

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
        expected.add(FIRST_ITEM);
        bag.add(FIRST_ITEM);

        ArrayList<String> result = bag.getAllItems();

        assertThat(result, equalTo(expected));
    }

    @Test void
    get_four_item_bag_if_five_item_where_added(){
        expected.add(FIRST_ITEM);
        expected.add(FIRST_ITEM);
        expected.add(FIRST_ITEM);
        expected.add(FIRST_ITEM);

        bag.add(FIRST_ITEM);
        bag.add(FIRST_ITEM);
        bag.add(FIRST_ITEM);
        bag.add(FIRST_ITEM);
        bag.add(FIRST_ITEM);

        ArrayList<String> result = bag.getAllItems();
        assertThat(result, equalTo(expected));
    }

    @Test void
    order_items_alphabetically(){
        String SECOND_ITEM = "Hammer";
        expected.add(FIRST_ITEM);
        expected.add(SECOND_ITEM);

        bag.add(FIRST_ITEM);
        bag.add(SECOND_ITEM);

        bag.sortItemsAlphabetically();

        ArrayList<String> items = bag.getAllItems();

        assertThat(items, equalTo(expected));
    }
}
