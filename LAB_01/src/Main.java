import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(zad1());
        zad2(5,5);
        System.out.println(zad3(5));
        System.out.println(zad4(31));
        System.out.println(zad5(3));
        System.out.println(zad6(36));
        generotorLiczbLosowychDoZad7();
    }
    public static String zad1(){
        return "Imię: Paweł, Wiek: 20";
    }
    public static void zad2(double x, double y){
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
    }
    public static boolean zad3(double x){
        return (x % 2 == 0);
    }
    public static boolean zad4(double x){
        return ((x % 3 == 0) && (x % 5 == 0));
    }
    public static double zad5(double x){
        return Math.pow(x,3);
    }
    public static double zad6(double x){
        return Math.sqrt(x);
    }
    public static void generotorLiczbLosowychDoZad7(){
        Random random = new Random();

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj dolną granicze przedziału");
        int a = input.nextInt();
        System.out.println("Podaj górną granice przedziału");
        int b = input.nextInt();

        // Generate three random lengths within the range <a,b>
        int length1 = a + random.nextInt(b - a + 1);
        int length2 = a + random.nextInt(b - a + 1);
        int length3 = a + random.nextInt(b - a + 1);

        System.out.println(zad7(length1 , length2 , length3));
    }
    public static boolean zad7(int x, int y, int z){
        if((x*x + y*y == z*z) || (z*z + x*x == y*y) || (z*z + y*y == x*x)){
            return true;
        }
        return false;
    }
}