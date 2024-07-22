package q1338;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char a = 'A';


        for (int i = 0; i < N; i++) {
            System.out.print(" ");
            for(int j=i,k=N-1;k>=0;j++,k--) {
                System.out.print(i+" "+j);
                a+=N;
            }
            a-=(N);
            System.out.println();
        }
    }
}
