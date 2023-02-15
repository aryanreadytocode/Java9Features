package private_method_interface;

public interface PrivateMethodInInterface {

    void hi();

    default void greet() {
        System.out.println("Inside default greet method..");
        privateMethodInsideInterface();
        staticPrivateMethodInsideInterface();
    }

    private void privateMethodInsideInterface() {
        System.out.println("Welcome in Interface private method in Java 9...");
    }

    private static void staticPrivateMethodInsideInterface() {
        System.out.println("Welcome to static private method inside interface in Java 9...");
    }
}
