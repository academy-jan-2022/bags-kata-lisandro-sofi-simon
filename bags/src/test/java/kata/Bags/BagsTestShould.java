package kata.Bags;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BagsTestShould {

    @Test void add_the_item_to_backpack(){
        String item = "Axe";
        DuranceStorage duranceStorage = new DuranceStorage();
        String[] output = duranceStorage.add(item);
        String[] expected = new String[]{item};

        assertEquals(expected[0], output[0]);

    }

    @Test void add_two_items_to_backpack(){
        String first_item = "Axe";
        String second_item = "Hammer";
        DuranceStorage duranceStorage = new DuranceStorage();

        duranceStorage.add(first_item);
        var items = duranceStorage.add(second_item);

        String[] expected = new String[]{first_item, second_item};

        assertEquals(items.length, 2);
        assertThat(items, equalTo(expected));
    }

}
