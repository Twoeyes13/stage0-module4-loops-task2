package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int start = 0;
        while (start <= printToInclusive) {
            int startFactorial = 1;
            int factorialResult = 1;

            while (startFactorial <= start){
                factorialResult *= startFactorial++;
            }
            if (printToInclusive == 0) System.out.println(1);
                else System.out.println(factorialResult);

            start++;
        }
    }
}
