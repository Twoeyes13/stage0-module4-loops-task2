package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int printNumber = 0;
        while (printNumber <= lastPrinted) {
            System.out.println(printNumber++);
        }
    }
}
