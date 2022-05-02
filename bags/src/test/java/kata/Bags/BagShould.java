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
}
