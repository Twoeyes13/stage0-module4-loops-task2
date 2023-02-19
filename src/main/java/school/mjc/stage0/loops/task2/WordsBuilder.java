package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int start = 0;
        while (start < chars.length) {
            System.out.print(chars[start++]);
        }
    }
}
