package private_method_interface;

interface Sayable {
//    default void say() {
//        saySomething();
//        sayPolitely();
//    }
//    private void saySomething() {
//        System.out.println("Hello... I am private method");
//    }

//    private static void sayPolitely() {
//        System.out.println("I'm private static method");
//    }
}

public class PrivateInterface implements Sayable {
    public static void main(String[] args) {
        Sayable s = new PrivateInterface();
//        s.say();
    }
}
