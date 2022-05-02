package kata.Bags;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BackpackShould {

    private Backpack backpack;
    private ArrayList<String> expected;
    String FIRST_ITEM = "Axe";
    String SECOND_ITEM = "Hammer";

    @BeforeEach
    void setUp() {
        backpack = new Backpack();
        expected = new ArrayList<>() {};
    }

    @Test void
    get_all_items(){
        Backpack backpack = new Backpack();

        backpack.add(FIRST_ITEM);
        backpack.add(SECOND_ITEM);

        var items = backpack.getAllItems();

        expected.add(FIRST_ITEM);
        expected.add(SECOND_ITEM);

        assertThat(items, equalTo(expected));
    }

    @Test void add_the_item_to_backpack(){
        backpack.add(FIRST_ITEM);

        expected.add(FIRST_ITEM);
        ArrayList<String> items = backpack.getAllItems();

        assertThat(items, equalTo(expected));
    }

    @Test void add_two_items_to_backpack(){
        backpack.add(FIRST_ITEM);
        backpack.add(SECOND_ITEM);

        expected.add(FIRST_ITEM);
        expected.add(SECOND_ITEM);

        ArrayList<String> items = backpack.getAllItems();

        assertThat(items, equalTo(expected));
    }

    @Test
    void add_multiple_items(){
        backpack.add(FIRST_ITEM);
        backpack.add(SECOND_ITEM);
        backpack.add(SECOND_ITEM);
        backpack.add(SECOND_ITEM);
        backpack.add(SECOND_ITEM);

        expected.add(FIRST_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);

        ArrayList<String> items = backpack.getAllItems();

        assertThat(items, equalTo(expected));
    }

    @Test void
    not_add_more_than_eight_items(){
        backpack.add(FIRST_ITEM);
        backpack.add(SECOND_ITEM);
        backpack.add(SECOND_ITEM);
        backpack.add(SECOND_ITEM);
        backpack.add(SECOND_ITEM);
        backpack.add(SECOND_ITEM);
        backpack.add(SECOND_ITEM);
        backpack.add(SECOND_ITEM);
        backpack.add(SECOND_ITEM);

        expected.add(FIRST_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);

        ArrayList<String> items = backpack.getAllItems();

        assertThat(items, equalTo(expected));
    }

    @Test void
    sort_items_alphabetically() {
        backpack.add(SECOND_ITEM);
        backpack.add(FIRST_ITEM);

        expected.add(FIRST_ITEM);
        expected.add(SECOND_ITEM);

        backpack.sortItemsAlphabetically();

        ArrayList<String> items = backpack.getAllItems();

        assertThat(items, equalTo(expected));
    }
}
