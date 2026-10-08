public class MemoryTasks {
    public static void main(String[] args) {
        int number = 42;
        int[] data = {1, 2, 3};

        reset(number);
        print(number, data);

        resetFirst(data);
        print(number, data);

        replace(data);
        print(number, data);

    }


    static void print(int number, int[] data) {
        System.out.println(number);
        for (int datum : data) {
            System.out.println(datum);
        }
    }

    static void reset(int value) {
        value = 0;
    }

    static void resetFirst(int[] values) {
        values[0] = 0;
    }

    static void replace(int[] values) {
        values = new int[values.length];
    }
}