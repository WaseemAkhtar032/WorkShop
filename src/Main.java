public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Workshop 1");
        InputString s = new InputString();
        int[] q = s.inputString();

        SmallestLargest sl = new SmallestLargest();
        sl.smallestLargest(q);
    }
}
