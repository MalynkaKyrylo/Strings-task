package task1;

public class Main {

    private final static String[] incorrectStr = {"brange", "plum", "tomato", "onibn", "grape"};

    public static void main(String[] args) {
    printStrArray(correctBtoO(incorrectStr));
    }
    private static String[] correctBtoO (String[] incorrectStr) {
        int length = incorrectStr.length;
        String[] correctStr = new String[length];
        for (int i = 0; i < length; i++) {
            correctStr[i] = incorrectStr[i].replace("b", "o");
        }
        return correctStr;
    }
    private static void printStrArray(String[] array) {
        int count = 1;
        for (String name : array) {
            System.out.println(count + ") " + name);
            count++;
        }

    }
}
