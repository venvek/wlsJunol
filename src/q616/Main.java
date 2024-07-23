package q616;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] tri = new int [3];
        int gpsx = 0;
        int gpsy = 0;
        for(int i=0;i<tri.length;i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            gpsx+=x1;
            gpsy+=y1;

        }
        System.out.print("(");
        System.out.printf("%.1f",(double)gpsx/3);
        System.out.print("," + " ");
        System.out.printf("%.1f",(double)gpsy/3);
        System.out.print(")");
    }
}
    class trya{
    private int X1;
    private int Y1;

    public trya(int x1, int y1) {
        this.X1 = x1;
        this.Y1 = y1;

        }
        public int getY1() {
        return Y1;
        }

        public int getX1() {
            return X1;
        }

        public void setX1(int x1) {
            X1 = x1;
        }

        public void setY1(int y1) {
            Y1 = y1;
        }
    }

