package private_method_interface;

public class PrivateMethodInInterfaceImpl implements PrivateMethodInInterface {
    @Override
    public void hi() {
        System.out.println("HI");
    }

    public static void main(String[] args) {
        PrivateMethodInInterface w = new PrivateMethodInInterfaceImpl();
        w.greet();
        w.hi();
    }
}
