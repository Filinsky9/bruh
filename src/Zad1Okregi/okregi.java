package Zad1Okregi;

import java.util.Scanner;

public class okregi {
    public static char polozenie (int xo,int yo,int r, int x,int y){
        char litera = 'a';



            if ((x - xo) * (x - xo) + (y - yo) == r * r) {
                System.out.println("E");
                litera = 'E';
            } else if ((x - xo) * (x - xo) + (y - yo) < r * r) {
                System.out.println("I");
                litera = 'I';
            } else if ((x - xo) * (x - xo) + (y - yo) > r * r) {
                System.out.println("O");
                litera = 'O';
            }
            return litera;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj szerokosc srodka okregu");
        int xo = scan.nextInt();
        System.out.println("Podaj wysokosc srodka okregu");
        int yo = scan.nextInt();
        System.out.println("Podaj promien okregu");
        int r = scan.nextInt();
        System.out.println("Podaj szerokosc punktu");
        int x = scan.nextInt();
        System.out.println("Podaj wysokosc punktu");
        int y = scan.nextInt();
        polozenie(xo,yo,r,x,y);




    }



}