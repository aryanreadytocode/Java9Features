package varargs_enhance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SafevarargsTest {

    @SafeVarargs
    private void print(List<String>... topics) {
        for (List<String> topic : topics)
            System.out.println(topic);
    }

    public static void main(String[] args) {
        SafevarargsTest safe = new SafevarargsTest();
        List<String> list = new ArrayList<String>();
        list.add("Oops");
        list.add("Collection");
        safe.print(list);
    }
}
