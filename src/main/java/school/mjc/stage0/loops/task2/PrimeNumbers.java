package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int start = 2;
        while (start <= printToInclusive) {
            int i = 2;
            boolean simpleNumber = true;
            while (i < start) {
                if (start % i == 0)
                {
                    simpleNumber = false;
                }
                if (start == 2){

                }
                i++;
            }

            if (simpleNumber == true) {
                System.out.println(start);
            }
            start += 1;
        }
    }
}
