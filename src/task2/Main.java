package task2;

public class Main {
    private final static String[] array1 = {"orange", "plum", "tomato", "onion", "grape", "onion"};
    private final static String ONION = "onion";
    public static void main(String[] args) {
        printStrArray(deleteOnion(array1));
    }
    private static String[] deleteOnion(String[] array) {
        int countOnion = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ONION) {
                countOnion++;
            }
        }
        int length2 = array.length-countOnion;
        String[] array2 = new String[length2];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != ONION) {
                array2[j] = array1[i];
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
