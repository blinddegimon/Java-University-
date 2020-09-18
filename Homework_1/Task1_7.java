package com.first;
import java.util.Scanner;

public class Task1_7 {
    /**
     * @param args 
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print ("Input a set of numbers, at the end input any symbol(not integer). For example: '1 2 3 c':");
        boolean done = true;
        int x = 0;
        int r = 1;
        while(done){
            x = in.nextInt();
            r *= x;
            if(!in.hasNextInt()){
                done = false;
            }
        }
        System.out.println("Result of multiplication: " + r);
        in.close();
    }
}
