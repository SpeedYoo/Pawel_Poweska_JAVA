import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        zad1();
//        zad2();
//        zad3(10,20,6);
//        zad4();
//        zad5();
        zad6();
    }
    public static void zad1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj stałą a: ");
        int a = input.nextInt();;
        System.out.println("Podaj stałą b: ");
        int b = input.nextInt();
        System.out.println("Podaj Stałą c: ");
        int c = input.nextInt();

        int delta = b*b - 4 * a * c;
        double x1 = (-b - Math.sqrt(delta)) / 2 * a;
        double x2 = (-b + Math.sqrt(delta) )/ 2 * a;

        System.out.println("x1: "+ x1);
        System.out.println("x2: "+ x2);
    }
    public static double a(double x){
        if(x > 0) return 2 * x;
        if(x < 0) return -3 * x;
        return 0;
    }
    public static double b(double x){
        if(x >= 1) return x*x;
        return x;
    }
    public static double c(double x){
        if(x > 2) return 2 +x;
        if(x < 2) return x-4;
        return 8;
    }

    public static void zad2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj argument x: ");
        double x = input.nextDouble();
        System.out.println("a("+x+") = "+ a(x));
        System.out.println("b("+x+") = "+ b(x));
        System.out.println("c("+x+") = "+ c(x));
    }
    public static void zad3(int x, int y, int z){
        if(x > y){
            int temp = x;
            x = y;
            y = temp;
        }
        if(y > z){
            int temp = y;
            y = z;
            z = temp;
        }
        if(x > y){
            int temp = x;
            x = y;
            y = temp;
        }
        System.out.println("Posortowane liczby");
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("z: "+z);
    }
    public static void zad4(){
        Scanner input = new Scanner(System.in);
        System.out.println("Czy pada deszcz ? Napisz TAK lub NIE");
        boolean rain = "TAK".equalsIgnoreCase(input.next());
        System.out.println("Czy jest autobus ? Napisz TAK lub NIE");
        boolean bus = "TAK".equalsIgnoreCase(input.next());
        if(rain && bus){
            System.out.println("Weź parasol, Dostaniesz się na uczelnie");
        }
        if(rain && !bus){
            System.out.println("Nie dostaniesz się na uczelnie");
        }
        if(!rain && bus){
            System.out.println("Dostaniesz się na uczelnia, miłego dnia i pięknej pogody");
        }
    }
    public static void zad5(){
        Scanner input = new Scanner(System.in);
        System.out.println("Czy jest zniżka ? Napisz TAK lub NIE");
        boolean discout = "TAK".equalsIgnoreCase(input.next());
        System.out.println("Czy dostałeś premię ? Napisz TAK lub NIE");
        boolean bonus = "TAK".equalsIgnoreCase(input.next());
        if(!discout || bonus){
            System.out.println("Możesz kupić samochód, zniżki na samochód już nie ma");
        }
        if(!discout || !bonus){
            System.out.println("Zakup samochodu trzeba odłożyć na pózniej, zniżki na samochód już nie ma");
        }
        if(discout || bonus){
            System.out.println("Możesz kupić samochód");
        }
    }
    public static void zad6(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int x = input.nextInt();
        System.out.println("Napisz jakie działanie chcesz wykonać: +, -, *, /, %");
        String operation = input.next();
        System.out.println("Podaj drugą liczbę: ");
        int y = input.nextInt();
        switch(operation){
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
        }
    }
}