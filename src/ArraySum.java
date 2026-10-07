public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {4,8,15};
        int sum = 0;
        for (int i =0; i<numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);
    }

}