package Homework_2;

import java.util.Scanner;

public class Task2_3{
    public static void main(String[] args) {
        int x;
        String bin;
        System.out.println();
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        bin = Integer.toBinaryString(x);
        System.out.println(bin);
        int c = 0;
        for (int i=0; i < bin.length(); i++)
        {
            if (i != bin.length()-1) {
                if (bin.substring(i, i + 2).equals("11")) {
                    c += 1;
                }
            }
        }
        System.out.println(c);
    }
}