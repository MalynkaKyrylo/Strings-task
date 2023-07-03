package task1;

public class Main {

    private final static String[] INCORRECTSTR = {"brange", "plum", "tomato", "onibn", "grape"};

    public static void main(String[] args) {
    printStrArray(correctBtoO(INCORRECTSTR));
    }
    private static String[] correctBtoO (String[] array) {
        int length = array.length;
        String[] newArray = new String[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = array[i].replace("b", "o");
        }
        return newArray;
    }
    private static void printStrArray(String[] array) {
        int count = 1;
        for (String name : array) {
            System.out.println(count + ") " + name);
            count++;
        }
    }
}
