package q608;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char c = 'c';
        String ab = "ab";

        if(text.contains("c") ==true) {
            System.out.print("Yes"+ " ");
        }
        else{
            System.out.print("No" + " ");
        }

        if(text.contains("ab") ==true) {
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
