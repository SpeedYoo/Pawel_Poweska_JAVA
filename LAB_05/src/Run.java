import java.util.Scanner;

public class Run {
    //metoda running która będzie odpowiadać za wyświetlenie logiki to pętla while w której będzie switch
    public void Running(){
        int wybor;
        while(true){

            Menu();
            wybor = InputInt();
            switch(wybor){
                case 1 -> viewCircle();
                case 2 -> viewSquare();
                case 3 -> viewRectangle();
                case 4 -> viewCube();
                case 5 -> viewCuboid();
                case 6 -> viewSphere();
                case 7 -> viewCone();
                default -> System.exit(0);
            }
        }
    }


    private void viewCone() {
        Cone cone = new Cone();
        System.out.println("Podaj promień r: ");
        double r = InputDouble();
        System.out.println("Podaj wysokośch h: ");
        double h = InputDouble();
        System.out.println("Podaj tworzącą stożka l:");
        double l = InputDouble();
        cone.setR(r);
        cone.setH(h);
        cone.setL(l);
        cone.view1();
    }

    private void viewSphere() {
        Sphere sphere = new Sphere();
        System.out.println("Podaj promień r");
        double r = InputDouble();
        sphere.setR(r);
        sphere.view1();
    }

    private void viewCuboid() {
        Cuboid cuboid = new Cuboid();
        System.out.println("Podaj bok a: ");
        double a = InputDouble();

         System.out.println("Podaj bok b: ");
        double b = InputDouble();

         System.out.println("Podaj bok c: ");
        double c = InputDouble();

        cuboid.setA(a);
        cuboid.setB(b);
        cuboid.setC(c);
        cuboid.view1();

    }

    private void viewCube() {
        Cube cube = new Cube();
        System.out.println("Podaj bok a:");
        double a = InputDouble();
        if(a > 0) {
            cube.setA(a);

        }else if(a < 0) {
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbę dodatnią r = "+ Math.abs(a));
            cube.setA(Math.abs(a));
        }else System.out.println("Liczba nie może być zerem");
        cube.view1();
    }

    private void viewRectangle() {
        Rectangle rectangle = new Rectangle();
        System.out.println("Podaj bok a: ");
        double a = InputDouble();
        System.out.println("Podaj bok b:");
        double b = InputDouble();

        if(a > 0 && b > 0) {
            rectangle.setA(a);
            rectangle.setB(b);
        }else if(a < 0 && b < 0) {
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbę dodatnią r = "+ Math.abs(a));
            rectangle.setA(Math.abs(a));
        }else System.out.println("Liczba nie może być zerem");

        rectangle.view1();
    }

    private void viewSquare() {
        Square square = new Square();
        System.out.println("Podaj bok a:");
        double a = InputDouble();
        if(a > 0) {
            square.setA(a);

        }else if(a < 0) {
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbę dodatnią r = "+ Math.abs(a));
            square.setA(Math.abs(a));
        }else System.out.println("Liczba nie może być zerem");
        square.view1();
    }

    private void viewCircle() {
        Circle circle = new Circle();
        System.out.println("Podaj promień: ");
        double r = InputDouble();
        if(r > 0) {
            circle.setR(r);

        }else if(r < 0) {
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbę dodatnią r = "+ Math.abs(r));
            circle.setR(Math.abs(r));
        }else System.out.println("Liczba nie może być zerem");
        circle.view1();
    }

    public void Menu(){
        System.out.println("\nMenu programu: Wybierz odpowiędnią opcje");
        System.out.println("0 - Wyjdź z programu 1 - koło, 2 - kwadrat, 3 - Prostokąt, 4 - Sześcian, 5 - Prostopadłościan, 6 - Kula, 7 - Stożek ");
    }
    public int InputInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public double InputDouble(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }
}
