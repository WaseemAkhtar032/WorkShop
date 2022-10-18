package workshop1;

import java.util.Scanner;

public class InputString {

    public static void main(String[] args) {
        String str = "";
        System.out.println("\tEnter the input string ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int i;
        int arr[] = new int[str.length()];
        String[] split = str.split(",");
        for (i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        for (i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            int element = str.charAt(i);
            arr[i] = element;
        }
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
