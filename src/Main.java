import workshop1.InputString;
import workshop1.SmallestLargest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to workshop ");
        InputString s = new InputString();
        int[] q = s.inputString();

        SmallestLargest sl = new SmallestLargest();
        sl.smallestLargest(q);
    }
}