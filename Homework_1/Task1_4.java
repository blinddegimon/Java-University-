package com.first;
import java.util.Scanner;

public class Task1_4 {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print ("Input a number Celsius:");
        int C = in.nextInt();
        int F = 9*C/5+32;
        System.out.println(C);
        System.out.println("F="+F);
        System.out.println("Виконавець: Бєлов Артем. Час: 10.09.2020. Номер завдання: 1.4");
        in.close();
    }
}
