public class MaxFinder {
    public static void main(String[] args) {
        int[] temperatures = {-5, -12, -3, -8};
        int max = temperatures[0];
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > max) {
                max = temperatures[i];
            }
        }
        System.out.println(max);
    }
}