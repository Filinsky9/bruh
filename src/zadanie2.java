import java.util.Scanner;


import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class zadanie2{
    public static double Fib(int n){
        double Fn;

        Fn =1/ Math.sqrt(5) * (1 + Math.sqrt(5)/ 2) * Math.pow(n,n) - 1/Math.sqrt(5) * (1 - Math.sqrt(5) / 2) * Math.pow(n,n);
        return Fn;
    }
    public static int Wypisz(){
        for (int i = 0; i <24 ; i++) {
            String F ="F";
            System.out.print(F+i+" = ");

            for (int j = 0; j <1 ; j++) {
                System.out.println(Fib(i));

            }
        }
        return 0;
    }
    public static void main(String[]args){
        System.out.println(Wypisz());

    }



}
