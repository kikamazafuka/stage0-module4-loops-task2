package school.mjc.stage0.loops.task2;

public class FactorialNumbers {

    public void printFactorialRow(int printToInclusive) {
        int n = 0;
        while (n<=printToInclusive){
            System.out.println(countFactorial(n));
            n++;
        }
    }
    static long countFactorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }
}
