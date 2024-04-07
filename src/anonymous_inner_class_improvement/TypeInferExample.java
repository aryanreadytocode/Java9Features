package anonymous_inner_class_improvement;

public class TypeInferExample {
    public static void main(String[] args) {
        ABCD<String> a = new ABCD<>() {
            @Override
            String show(String a, String b) {
                return a + b;
            }
        };
        String result = a.show("Java", "9");
        System.out.println(result);
    }
}

abstract class ABCD<T> {
    abstract T show(T a, T b);
}
