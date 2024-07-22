package q1071;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ysum =0;
        int xsum =0;
        int a;
        int aa [] = new int[n];
        for(int i=0; i<n; i++) {
            a = sc.nextInt();
            aa[i]=a;
        }
            int m = sc.nextInt();
        for(int j=0; j<n; j++) {
            if (aa[j] % m == 0) {
                ysum += aa[j];
            }
            if (m % aa[j] ==0) {
                xsum += aa[j];
            }
        }
        System.out.println(xsum);
        System.out.println(ysum);
}
}
