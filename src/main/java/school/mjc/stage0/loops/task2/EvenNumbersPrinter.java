package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int start = 0;
        while (start <= printTillInclusive) {
            System.out.println(start);
            start += 2;
        }
    }
}
