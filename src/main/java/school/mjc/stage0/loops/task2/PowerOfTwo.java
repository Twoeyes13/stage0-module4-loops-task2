package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int start = 0;
            while (start <= power) {
                int powerOfTwo = 1;
                int inital = 1;
                if (start == 0) {
                    System.out.println(1);
                } else {
                    while (inital <= start) {
                        powerOfTwo *= 2;
                        inital++;
                    }
                    System.out.println(powerOfTwo);
                }
                start++;
            }
        }
    }
}
