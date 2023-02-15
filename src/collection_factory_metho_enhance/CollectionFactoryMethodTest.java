package collection_factory_metho_enhance;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethodTest {

    public static void main(String[] args) {
        // prior to java 9
        List<String> list = new ArrayList<>();
        list.add("Anu");
        list.add("Raj");
        list.add("Chotu");
        list.add("Golu");
        System.out.println(list);
        System.out.println("==========================");

        List<String> names = List.of("Anu", "Raj", "Chotu", "Golu", "Anu");
        names.forEach(System.out::println);

        System.out.println("==========================");

        Set<String> setNames = Set.of("Anu", "Chhotu", "Golu");
        setNames.forEach(System.out::println);

        System.out.println("==========================");

        Map<Integer, String > empNameMap1 = Map.of(100, "Chad Lemieux", 101, "Erik Solen", 102, "Ken Tarr", 104, "Janet Van");
        empNameMap1.forEach( (key, value) -> System.out.println("key: "+key+" value: "+value));

        System.out.println("==========================");

        Map.Entry<Integer, String> entry1 = Map.entry(106, "Kyle Kborth");
        Map.Entry<Integer, String> entry2 = Map.entry(107, "Natalie Dave");
        Map.Entry<Integer, String> entry3 = Map.entry(108, "Jonathan Silva");

        Map<Integer, String> maps = Map.ofEntries(entry1, entry2, entry3);
        maps.forEach((key, value) -> System.out.println("key: "+key+" value: "+value));
    }
}
