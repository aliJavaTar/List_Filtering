import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListFilteringKataTest {
    ListFilteringKata filtering;

    @BeforeEach
    void listObject() {
        filtering = new ListFilteringKata();
    }

    @Test
    public void justGiveInteger() {

        List<Object> objects = Arrays.asList(new Object[]{2, 4, 4});
        List<Integer> integers = filtering.integerList(objects);


        assertEquals(integers, Arrays.asList(2, 4, 4));
    }

    @Test
    public void justGiveString() {

        List<Object> objects = Arrays.asList(new Object[]{"2", "4", "4"});
        List<Integer> integers = filtering.integerList(objects);
        assertEquals(integers, List.of());
    }

    @Test
    public void objectArray() {

        List<Object> objects = Arrays.asList(new Object[]{2, "4", "4", 3});
        List<Integer> integers = filtering.integerList(objects);
        assertEquals(integers, Arrays.asList(2, 3));
    }


}