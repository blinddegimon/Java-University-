package Homework_2;

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        int a, b;
        String bin, first, second;
        System.out.println();
        Scanner number = new Scanner(System.in);
        a = number.nextInt();
        bin = Integer.toBinaryString(a);
        System.out.println(a + " in double system: ");
        System.out.println(bin);
        System.out.println();
        b = number.nextInt()-1;
        first = bin.substring(0, b);
        second = bin.substring(b+1, bin.length());
        System.out.println("Your number: ");
        System.out.println(first+second);
        System.out.println("Answer is: " + Integer.parseInt(first+second, 2));
    }
}
