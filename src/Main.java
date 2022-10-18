public class Main {
    public static void main(String[] args) {
        System.out.println(" WELCOME TO WORKSHOP 1 ");
        InputString s = new InputString();
        int[] q = s.inputString();

        SmallestLargest sl = new SmallestLargest();
        sl.smallestLargest(q);
    }
}
