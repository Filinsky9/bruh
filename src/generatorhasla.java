import java.util.Random;
import java.util.Scanner;
public class generatorhasla {

//Mikołaj Tomaszewski
//2pp

    public static String newpassword() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj długość: ");
        int haslo = scan.nextInt();
        if (haslo <= 11) {
            System.out.println("Musi być więcej, niż 12 znaków. ");
        } else {
            String pass = "";
            Random gen = new Random();
            int znaki = 0;
            for (int petla = 0; petla <= haslo; petla++) {

                znaki = (gen.nextInt(155) + 100);
                char znak = (char) znaki;
                pass += znak;
            }
            return pass;
        }
        return "";
    }

    public static void main(String[] args) {

        System.out.println(newpassword());
    }


}