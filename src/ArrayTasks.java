
public class ArrayTasks {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = reverse(array);

        for (int i : array) {
            System.out.println(i);
        }

        for (int i : result) {
            System.out.println(i);
        }

        for (int n = 10; n <= 15; n++) {
            int factInt = factorialInt(n);
            long factLong = factorialLong(n);

            System.out.println(n + " " + factInt + " " + factLong);
        }
        char[] characters = {'a', '7', 'x', '0', '!', '3'};
        System.out.println(countDigits(characters));


    }

    static int[] reverse(int[] values) {
        int[] reversedArray = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            reversedArray[i] = values[values.length - 1 - i];
        }
        return reversedArray;
    }

    static int factorialInt(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static long factorialLong(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int countDigits(char[] symbols) {
        int result = 0;
        for (char symbol : symbols) {
            if (symbol <= '9' && symbol >= '0') {
                result++;
            }
        }
        return result;
    }


}