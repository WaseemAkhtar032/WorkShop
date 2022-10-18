package workshop1;

import java.util.Scanner;

public class InputString {

    public int[] inputString() {
        String str = "";
        System.out.println("\tEnter the input string ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int i;

        String[] split = str.split(",");
        int len = split.length;
        int arr[] = new int[len];
        //for (i = 0; i <str.length(); i++)
        i=0;
        while (i < (split.length)) {
            arr[i] = Integer.parseInt(split[i]);
            i++;
        }
        for (i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n\n");
        return arr;

    }
}
