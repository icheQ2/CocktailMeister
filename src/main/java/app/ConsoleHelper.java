package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static final BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return bis.readLine();
    }

    public static int readInt() throws IOException {
        String text = readString();
        return Integer.parseInt(text);
    }

    public static double readDouble() throws IOException {
        String text = readString();
        return Double.parseDouble(text);
    }
}