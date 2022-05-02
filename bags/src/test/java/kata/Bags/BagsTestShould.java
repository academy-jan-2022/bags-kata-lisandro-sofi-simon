package kata.Bags;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BagsTestShould {

    private DuranceStorage duranceStorage;
    private ArrayList<String> expected;
    String FIRST_ITEM = "Axe";
    String SECOND_ITEM = "Hammer";

    @BeforeEach
    void setUp() {
        duranceStorage = new DuranceStorage();
        expected = new ArrayList<>() {};
    }

    @Test void
    get_all_items(){
        DuranceStorage duranceStorage = new DuranceStorage();

        duranceStorage.add(FIRST_ITEM);
        duranceStorage.add(SECOND_ITEM);

        var items = duranceStorage.getAllItems();

        expected.add(FIRST_ITEM);
        expected.add(SECOND_ITEM);

        assertThat(items, equalTo(expected));
    }

    @Test void add_the_item_to_backpack(){
        duranceStorage.add(FIRST_ITEM);

        expected.add(FIRST_ITEM);
        ArrayList<String> items = duranceStorage.getAllItems();

        assertThat(items, equalTo(expected));
    }

    @Test void add_two_items_to_backpack(){
        duranceStorage.add(FIRST_ITEM);
        duranceStorage.add(SECOND_ITEM);

        expected.add(FIRST_ITEM);
        expected.add(SECOND_ITEM);

        ArrayList<String> items = duranceStorage.getAllItems();

        assertThat(items, equalTo(expected));
    }

    @Test
    void add_multiple_items(){
        duranceStorage.add(FIRST_ITEM);
        duranceStorage.add(SECOND_ITEM);
        duranceStorage.add(SECOND_ITEM);
        duranceStorage.add(SECOND_ITEM);
        duranceStorage.add(SECOND_ITEM);

        expected.add(FIRST_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);

        ArrayList<String> items = duranceStorage.getAllItems();

        assertThat(items, equalTo(expected));
    }

    @Test void
    not_add_more_than_eight_items(){
        duranceStorage.add(FIRST_ITEM);
        duranceStorage.add(SECOND_ITEM);
        duranceStorage.add(SECOND_ITEM);
        duranceStorage.add(SECOND_ITEM);
        duranceStorage.add(SECOND_ITEM);
        duranceStorage.add(SECOND_ITEM);
        duranceStorage.add(SECOND_ITEM);
        duranceStorage.add(SECOND_ITEM);
        duranceStorage.add(SECOND_ITEM);

        expected.add(FIRST_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);
        expected.add(SECOND_ITEM);

        ArrayList<String> items = duranceStorage.getAllItems();

        assertThat(items, equalTo(expected));
    }
}
