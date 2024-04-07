package varargs_enhance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SaveVarargsTest {
    // varargs stands for variable number of arguments
    // by using ... after data type in function params we can represent it
    // like calc(int... c)
    // so in the above method we can pass any number of variable
    // and the method treats it as list of params
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(100);
        list.add(200);
        list2.add(1);
        list.add(2);
        new SaveVarargsTest().loop(list, list2);
    }

    @SafeVarargs
    private void loop(List<Integer>... list) {
        Arrays.stream(list).forEach( list1 -> {
            AtomicInteger sum = new AtomicInteger();
            list1.forEach(val ->
                    sum.addAndGet(val)
            );
            System.out.println(sum.get());
        });
    }
}
