public class AverageCalculator {
    public static void main(String[] args) {
        int[] grades={90,75,60,85};
        int sum=0;
        for(int i=0;i<grades.length-1;i++){
            sum+=grades[i];
        }
        System.out.println(sum/grades.length);
    }
}