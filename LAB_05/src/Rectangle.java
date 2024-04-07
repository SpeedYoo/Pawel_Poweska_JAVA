public class Rectangle {
    private double a;
    private double b;
    final private String name = "Sześcian";

    public double pole(double a,double b){
        return a*b;
    }
    public double obwod(double a, double b){
        return 2*a + 2*b;
    }
    public void view(){
        System.out.println("Figura "+ name+" długość boku: "+a+" objetosc: ");
    }
    public void view1(){
        System.out.format("Figura %s, długość a = %.2f, pole = %.2f, obwód = %.2f \n", name, a, pole(a,b), obwod(a,b));
    }
    public double getA() {
        return a;
    }

    public String getName() {
        return name;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }
}
