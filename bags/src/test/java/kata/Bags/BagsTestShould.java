package kata.Bags;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BagsTestShould {
    @Test void add_the_item_to_backpack(){
        String item = "Axe";

        DuranceStorage duranceStorage = new DuranceStorage();
        ArrayList<String> output = duranceStorage.add(item);
        ArrayList<String> expected = new ArrayList<>() {
        };

        expected.add(item);

        assertThat(output, equalTo(expected));

    }

    @Test void add_two_items_to_backpack(){
        String first_item = "Axe";
        String second_item = "Hammer";
        DuranceStorage duranceStorage = new DuranceStorage();
        ArrayList<String> expected = new ArrayList<>() {};

        duranceStorage.add(first_item);
        var items = duranceStorage.add(second_item);

        expected.add(first_item);
        expected.add(second_item);

        assertThat(items, equalTo(expected));
    }

    @Test
    void add_multiple_items(){
        String first_item = "Axe";
        String second_item = "Hammer";
        DuranceStorage duranceStorage = new DuranceStorage();
        ArrayList<String> expected = new ArrayList<>() {};

        duranceStorage.add(first_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        var items = duranceStorage.add(second_item);

        expected.add(first_item);
        expected.add(second_item);
        expected.add(second_item);
        expected.add(second_item);
        expected.add(second_item);



        assertThat(items, equalTo(expected));
    }

    @Test void
    not_add_more_than_eight_items(){
        String first_item = "Axe";
        String second_item = "Hammer";
        DuranceStorage duranceStorage = new DuranceStorage();
        ArrayList<String> expected = new ArrayList<>() {};

        duranceStorage.add(first_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        duranceStorage.add(second_item);
        var items = duranceStorage.add(second_item);

        expected.add(first_item);
        expected.add(second_item);
        expected.add(second_item);
        expected.add(second_item);
        expected.add(second_item);
        expected.add(second_item);
        expected.add(second_item);
        expected.add(second_item);



        assertThat(items, equalTo(expected));
    }
    @Test void
    get_all_items(){
        String first_item = "Axe";
        String second_item = "Hammer";
        DuranceStorage duranceStorage = new DuranceStorage();
        ArrayList<String> expected = new ArrayList<>() {};

        duranceStorage.add(first_item);
        duranceStorage.add(second_item);

        var items =duranceStorage.getAllItems();

        expected.add(first_item);
        expected.add(second_item);

        assertThat(items, equalTo(expected));

    }

}
