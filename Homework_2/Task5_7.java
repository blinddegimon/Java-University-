package Homework_2;
import java.util.Scanner;
import java.util.ArrayList;


public class Task5_7 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int array[];
        array = new int[n];

        for(int i=0;i<n;i++){
            int x = in.nextInt();
            int cx = x;
            boolean done = true;
            int r = 9;

            while(done){
                int c = x%10;
                System.out.println(r + " < " + c);

                if(r < c){
                    done = false;
                    break;
                }
                r = c;
                x = x/10;
                if(x == 0){

                    done = false;
                    array[i] = cx;

                }

            }

        }

        for(int i=0;i<n;i++){

            int x = array[i];
            if(x==0){
                System.out.println(x);
            }

        }
    }
}
