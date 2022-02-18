package problem2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input = Integer.parseInt(reader.nextLine());

        System.out.println("Input: " + input);
        System.out.println(hailstone(input));
    }

    public static int hailstone(int n) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
            } else {
                n = n * 3 + 1;
                System.out.println(n);
            }
        }
        return n;
    }
}
