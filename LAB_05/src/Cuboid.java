public class Cuboid {
    private double a;
    private double b;
    private double c;
    final private String name = "Prostopadłościan";

    public double objetosc(double a,double b, double c){
        return a*b*c;
    }
    public double pole(double a,double b, double c){
        return 2*a*b + 2*a*c + 2*b*c;
    }

    public void view(){
        System.out.println("Figura "+ name+" długość boku: "+a+" objetosc: "+ objetosc(a,b,c));
    }
    public void view1(){
        System.out.format("Figura %s, długość a = %.2f, objetosc = %.2f, pole = %.2f", name, a, objetosc(a,b,c), pole(a,b,c));
    }

    public double getC() {
        return c;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    public String getName() {
        return name;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }
}
