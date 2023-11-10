package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        if (multiplyByAndToInclusive!=0) {
            while (count<=Math.abs(multiplyByAndToInclusive)){
                System.out.println(multiplyByAndToInclusive * count);
                count++;
            }
        }
    }
}
