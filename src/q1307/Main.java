package q1307;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a = 'A';
        a += (n * n) - 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(a + " ");
                a -= n;

            }
            if (i == 0) {
                a += (n * n) - 1;
                System.out.println();
            } else {
                a += (n * n) - 1;
                System.out.println();
            }
        }
    }
}

