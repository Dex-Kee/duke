package util;

import java.util.Scanner;

public class InputUtil {

    private InputUtil() {}

    private static final Scanner scanner = new Scanner(System.in);

    public static String getInputString() {
        return scanner.nextLine();
    }

}
