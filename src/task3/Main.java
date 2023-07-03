package task3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private final static String[] NAMESLIST = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};

    public static void main(String[] args) {
        String name = getName();
        getOutput(name, findName(name));
    }
    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        String name = "";
        while (name.length() < 1) {
            System.out.println("Enter name: ");
            name = scanner.nextLine();
        }
        return name;
    }
    private static int findName(String name) {
        int count = 0;
        for (String item : NAMESLIST) {
            if (name.equalsIgnoreCase(item)) {
            //Comparison is made ignoring the case of letters, bcs user can make a mistake
                count++;
            }
        }
        return count;
    }
    private static void getOutput(String name, int count) {
        if (count != 0) {
            System.out.println(name+ " Name matches in the list "+count+" time(s)");
        } else {
            System.out.println(name+" Name is not found in the list");
        }
        System.out.println();
    }
}
