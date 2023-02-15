package try_with_resource_enhance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TryWithResourceEnhancement {

    public static void main(String[] args) throws FileNotFoundException {
        // before java 1.7 we need to write like this
        InputStream inputStream = null;
        Scanner scanner = null;
        try {
            inputStream = new FileInputStream("test.txt");
            scanner = new Scanner(inputStream);
            while (scanner.hasNextLine())
                System.out.println(scanner.nextLine());

        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (scanner != null)
                scanner.close();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println();

        // but after release of java 1.7 try with resources has introduced


        try (InputStream inputStream1 = new FileInputStream("test.txt");
             Scanner scanner1 = new Scanner(inputStream1)) {
            while (scanner1.hasNextLine())
                System.out.println(scanner1.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        } // close will be called by jvm automatically

        System.out.println();

        // after java 9
        InputStream inputStream2 = new FileInputStream("test.txt");
        Scanner scanner2 = new Scanner(inputStream2);
        try(inputStream2; scanner2) {
            while (scanner2.hasNextLine())
                System.out.println(scanner2.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
