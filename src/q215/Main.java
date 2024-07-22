package q215;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        double Aa = Double.parseDouble(a);
        String [] Bb = b.split("@|#|%");
        int bbb = (int)Integer.parseInt(Bb[0]);

        int aaa = (int)Aa;
        System.out.println(aaa*bbb);
        }
}
