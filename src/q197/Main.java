package q197;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        xy [] xx = new xy[2];
        for(int i = 0; i < xx.length; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            xx[i] = new xy(x,y,x2,y2);

        }
        if(xx[0].getX()<xx[1].getX()) {
        System.out.print(xx[0].getX()+ " ");
        }
        else if(xx[0].getX()>=xx[1].getX()) {
            System.out.print(xx[1].getX()+ " ");
        }

        if(xx[0].getY()<xx[1].getY()) {
            System.out.print(xx[0].getY()+ " ");
        }
        else if(xx[0].getY()>=xx[1].getY()) {
            System.out.print(xx[1].getY()+ " ");
        }

        if(xx[0].getX2()<xx[1].getX2()) {
            System.out.print(xx[1].getX2()+ " ");
        }
        else {
            System.out.print(xx[0].getX2()+ " ");
        }

        if(xx[0].getY2()<xx[1].getY2()) {
            System.out.print(xx[1].getY2()+ " ");
        }
        else{
            System.out.print(xx[0].getY2()+ " ");
        }

    }
}

class xy {
    private int x;
    private int y;
    private int x2;
    private int y2;


    public xy(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void print() {
        System.out.print(x+ " ");
        System.out.print(y+ " ");
        System.out.print(x2+ " ");
        System.out.print(y2);
    }

    public int getX() {
    return x;
    }
    public int getY() {
        return y;
    }
    public int getX2() {
        return x2;
    }
    public int getY2() {
        return y2;
    }
}