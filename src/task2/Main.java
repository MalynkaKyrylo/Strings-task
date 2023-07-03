package task2;

public class Main {
    private final static String[] ARRAY1 = {"orange", "plum", "tomato", "onion", "grape", "onion"};
    private final static String ONION = "onion";
    public static void main(String[] args) {
        printStrArray(deleteOnion(ARRAY1));
    }
    private static String[] deleteOnion(String[] array) {
        int countOnion = 0;
        for (int i = 0; i < array.length; i++) {
            if (ONION.equals(array[i])) {
                countOnion++;
            }
        }
        int length2 = array.length-countOnion;
        String[] array2 = new String[length2];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (!ONION.equals(array[i])) {
                array2[j] = array[i];
            j++;
            };
        }
        return array2;
    }
    private static void printStrArray(String[] array) {
        int count = 1;
        for (String name : array) {
            System.out.println(count + ") " + name);
            count++;
        }
    }
}
