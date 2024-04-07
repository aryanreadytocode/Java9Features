package stream_api_enhance;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> list = Stream.of(2,4,5,6,7,8,9,10).dropWhile(integer -> (integer%2 == 0)).collect(Collectors.toList());
        System.out.println(list);

        System.out.println("Stream API >> Java 9 >> ordered stream with dropWhile");

        // ordered stream
        List.of(1,2,4,3,5,9,8).stream().dropWhile(e -> e<5).forEach(System.out::println);

        System.out.println("Stream API >> Java 9 >> unordered stream with dropWhile");

        // unordered stream
        Set.of(1,2,4,3,5,9,8).stream().dropWhile(e -> e<5).forEach(System.out::println);

        System.out.println("Stream API >> Java 9 >> ofNullable(T) with null value");

        Stream.ofNullable(null).forEach(System.out::println);

        System.out.println("Stream API >> Java 9 >> ofNullable(T) with value");

        List<String> listOfAryan = List.of("Raj", "Aryan", "Patna", "Bihar", "India");
        Stream.of(listOfAryan).forEach(System.out::println);
    }
}


