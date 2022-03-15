import java.util.Arrays;
import java.util.List;

public class ListFilteringKata {

    public List<Integer> integerList(List<Object> array) {
        return arrayIntegerWithoutNull(array);
    }

    private List<Integer> arrayIntegerWithoutNull(List<Integer> convertToInteger, List<Integer> arrayIntegerWithoutNull) {
        int counter = 0;
        for (Integer integer : convertToInteger) {
            if (integer != null) {
                arrayIntegerWithoutNull.set(counter, integer);
                ++counter;
            }
        }
        return arrayIntegerWithoutNull;
    }

    private List<Integer> arrayIntegerWithoutNull(List<Object> array) {
        List<Integer> convertToInteger = Arrays.asList(new Integer[array.size()]);

        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) instanceof Integer) {
                convertToInteger.set(i, (Integer) array.get(i));
            } else count++;
        }
        List<Integer> arrayIntegerWithoutNull = Arrays.asList(new Integer[array.size() - count]);
        return arrayIntegerWithoutNull(convertToInteger, arrayIntegerWithoutNull);


    }
}
