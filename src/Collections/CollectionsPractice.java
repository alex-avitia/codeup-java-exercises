package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsPractice {

    public static void main(String[] args) {

        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Justin", "Douglas", "Kenneth"));

        System.out.println(upperLastElement(names1));

    }

    static ArrayList<String> upperLastElement(ArrayList<String> names) {
        String lastElement = names.get(names.size() - 1);

        names.set(names.size() - 1, lastElement.toUpperCase());

        return names;
    }
}
