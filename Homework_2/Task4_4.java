package Homework_2;

import java.util.Scanner;
import java.util.ArrayList;

public class Task4_4{
    public static void main(String[] args) {
        int a, l=0, count = 0;
        boolean cur=false, last_cur=false;
        Scanner number = new Scanner(System.in);
        ArrayList<Integer> list_int = new ArrayList<Integer>();
        while (true){
            System.out.println();
            a = number.nextInt();
            if (a == 0)
                break;
            else
                list_int.add(a);
            ++l;
        }
        for (int i = 0; i < l; i++){
            if (list_int.get(i) > 0){
                cur = true;
            }
            if (list_int.get(i) < 0){
                cur = false;
            }
            if (i == 0){
                last_cur = cur;
            }
            if (i != 0){
                if (last_cur != cur){
                    ++count;
                }
            }
            last_cur = cur;
        }
        System.out.println(count);
    }
}