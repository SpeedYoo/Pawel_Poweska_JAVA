import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        zad1();
//        zad2();
//        zad3();
//        zad4();
 //       zad5();
    }
    public static void zad1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę studentów: ");
        int n = input.nextInt();
        int i = 0;
        int sum = 0;
        while(i < n){
            System.out.println("Podaj liczbę punktów dla studenta nr " + (i++ +1));
            sum += input.nextInt();
        }
        System.out.println("Średnia: "+(double) sum / n);
    }
    public static void zad2(){
        int possitiveNumbersCount = 0;
        int negativeNumbersCount = 0;
        int possitiveNumbersSum = 0;
        int negativeNumbersSum = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("Podaj liczbę nr "+(i+1));
            int number = input.nextInt();
            if(number > 0){
                possitiveNumbersCount++;
                possitiveNumbersSum += number;
            }
            if(number < 0){
                negativeNumbersCount++;
                negativeNumbersSum += number;
            }
        }
        System.out.println("Ilość liczb dodatnich: "+possitiveNumbersCount);
        System.out.println("Ilość liczb ujemnych: "+negativeNumbersCount);
        System.out.println("Suma liczb dodatnich: "+possitiveNumbersSum);
        System.out.println("Suma liczb ujemnych: "+negativeNumbersSum);
    }
    public static void zad3(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Suma liczb parzystych od 0 do n = "+sum);
    }
    public static void zad4(){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = input.nextInt();
        Random random = new Random();
        int min = -10;
        int max = 45;
        for(int i = 0; i < n; i++){
            int number = random.nextInt((max - min) + 1) + min;
            if(number % 2 == 0) sum += number;
        }
        System.out.println("Suma ciągu: "+sum);
    }
    public static void zad5(){
        System.out.println("Podaj słowo: ");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length() -i - 1)){
                System.out.println("Słowo nie jest palindromem");
                break;
            }
        }
        System.out.println("Słowo jest palindromem");
    }
}