package stream_api_enhance;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEnhancement {

    public static void main(String[] args) {
        // prior to java 9 we need to call
        // limit function explicitly to limit value
        List<Integer> collect1 = Stream.iterate(1, i -> i * 2).limit(10).toList();
        collect1.forEach(System.out::println);

        System.out.println("==== stream().iterate ===========================");
        // after java 9 release you can limit
        // value in iterate method itself by passing preicate

        List<Integer> collect2 = Stream.iterate(1, i -> i <= 10, i -> i * 2).toList();
        collect2.forEach(System.out::println);

        System.out.println("==== stream().takeWhile ===========================");

        List<Integer> collect3 = Stream.of(12, 6, 3, 9, 6, 8, 0, 99).toList();
        collect3.stream().takeWhile(i->i%3==0).forEach(System.out::println);

        System.out.println("==== stream().dropWhile ===========================");

        List<Integer> collect4 = Stream.of(12, 6, 3, 9, 6, 8, 0, 99).toList();
        collect4.stream().dropWhile(i->i%3==0).forEach(System.out::println);

        System.out.println("==== stream().ofNullable ===========================");

        Stream<Integer> s1 = Stream.ofNullable(12);
        Stream<Integer> s2 = Stream.ofNullable(null);
        System.out.println(s1.count());
        System.out.println(s2.count());


    }
}
