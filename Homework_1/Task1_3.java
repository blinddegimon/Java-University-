package com.first;
import java.util.Scanner;

public class Task1_3 {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int s = x+y;
        double r1 = Math.sqrt(s);
        int r2  = (int) r1;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Виконавець: Бєлов Артем. Час: 10.09.2020. Номер завдання: 1.3");
        in.close();
    }
}
