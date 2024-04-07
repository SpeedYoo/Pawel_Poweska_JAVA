import static java.lang.Math.PI;

public class Cone {
    private double r;
    private double h;

    private double l;

    final private String name = "Stożek";


    public double objetosc(double r, double h){
        return (double) 1/3 * PI * r * r * h;
    }
    public double pole(double r, double l){
        return PI * r * r + PI * r * l;
    }

    public void view1(){
        System.out.format("Figura %s, promień r = %.2f, objetosc = %.2f, pole = %.2f", name, r, objetosc(r,h), pole(r,l));
    }

    public double getL() {
        return l;
    }

    public String getName() {
        return name;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setH(double h) {
        this.h = h;
    }
}
