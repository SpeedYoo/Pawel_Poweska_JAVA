import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //zad1();
    //zad2();
//    zad4();
//        zad5();
       // zad6();
        zad7();
    }
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    public static void zad1(){
                int[] array = new int[10];

                for(int i = 0; i < array.length; i++) {
                    array[i] = generateRandomNumber(1, 100); 
                }
                int sum = 0;
                for(int number : array) {
                    sum += number;
                }


                System.out.println("suma: " + sum);
                System.out.println("Średnia: " + (double) sum / array.length);
            }
    public static void zad2(){
        int[] array1 = {0,1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        for(int i = 0; i < array1.length; i+=2){
            System.out.println(array1[i]);
        }
        for(int i = 0; i < array2.length; i+=2){
            System.out.println(array2[i]);
        }
    }
    public static void zad3(){
        String[] array = {"ala", "ma", "kota"};
        for(String word : array){
            System.out.println(word.toUpperCase());
        }
    }
    public static void zad4(){
        String[] array = new String[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Podaj słowo nr "+(i+1));
            array[i] = input.next();
        }
        for(int i = 4; i >= 0; i--){
            String word = array[i];
            String wordReversed = new StringBuilder(word).reverse().toString();
            System.out.println(wordReversed);
        }

    }
    public static void zad5(){
        int[] array = new int[8];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 8; i++){
            System.out.println("Podaj liczbe nr: "+(i+1));
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        for(int n : array){
            System.out.println(n);
        }
    }
    public static void zad6(){
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Podaj liczbe nr: "+(i+1));
            array[i] = input.nextInt();
        }
        for(int n : array){
            System.out.println(factioral(n));
        }

    }
    public static int factioral(int n){
        if(n == 1 || n == 0) return 1;
        return n * factioral(n-1);
    }
    public static void zad7(){
        boolean isTheSame = true;
        String[] stringArray1 = {"ala", "ma", "kota"};
        String[] stringArray2 = {"ala", "ma", "kota"};
        if(stringArray1.length == stringArray2.length){
            for(int i = 0; i < stringArray1.length; i++){
                if(stringArray1[i] != stringArray2[i]){
                   isTheSame = false;
                }
            }
            System.out.println(isTheSame);
        }
    }
        }