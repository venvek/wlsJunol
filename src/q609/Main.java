package q609;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] words = new String[3];
     //   System.out.println(word);
        for(int i = 0 ; i < words.length ; i++) {
            words[i] = sc.next();
        }
            if(words[0].charAt(0)>words[1].charAt(0)) {
            System.out.println(words[1]);
            }
            else if(words[1].charAt(0)>words[2].charAt(0)) {
                System.out.println(words[2]);
            }
            else if(words[0].charAt(0)<words[2].charAt(0)) {}
            System.out.println(words[0]);

    }
}
