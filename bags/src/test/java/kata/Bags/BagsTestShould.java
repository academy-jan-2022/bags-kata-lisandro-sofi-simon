package kata.Bags;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BagsTestShould {


    private DuranceStorage duranceStorage;
    private ArrayList<String> expected;

    @BeforeEach
    void setUp() {
        duranceStorage = new DuranceStorage();
        expected = new ArrayList<>() {};

    }

    @Test void
    get_all_items(){
        String first_item = "Axe";
        String second_item = "Hammer";
        DuranceStorage duranceStorage = new DuranceStorage();

        duranceStorage.add(first_item);
        duranceStorage.add(second_item);

        var items = duranceStorage.getAllItems();

        expected.add(first_item);
        expected.add(second_item);

        assertThat(items, equalTo(expected));
    }

    @Test void add_the_item_to_backpack(){
        String item = "Axe";

        duranceStorage.add(item);

        expected.add(item);
        ArrayList<String> items = duranceStorage.getAllItems();

        assertThat(items, equalTo(expected));

    }

    @Test void add_two_items_to_backpack(){
        String first_item = "Axe";
        String second_item = "Hammer";

        duranceStorage.add(first_item);
        duranceStorage.add(second_item);

        expected.add(first_item);
        expected.add(second_item);

        ArrayList<String> items = duranceStorage.getAllItems();

        assertThat(items, equalTo(expected));
    }

    @Test
    void add_multiple_items(){
        String first_item = "Axe";
        String second_item = "Hammer";

        duranceStorage.add(first_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);

        expected.add(first_item);
        expected.add(second_item);
        expected.add(second_item);
        expected.add(second_item);
        expected.add(second_item);

        ArrayList<String> items = duranceStorage.getAllItems();

        assertThat(items, equalTo(expected));
    }

    @Test void
    not_add_more_than_eight_items(){
        String first_item = "Axe";
        String second_item = "Hammer";

        duranceStorage.add(first_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);

        expected.add(first_item);
        expected.add(second_item);
        expected.add(second_item);
        expected.add(second_item);
        expected.add(second_item);
        expected.add(second_item);
        expected.add(second_item);
        expected.add(second_item);

        ArrayList<String> items = duranceStorage.getAllItems();

        assertThat(items, equalTo(expected));
    }
}
