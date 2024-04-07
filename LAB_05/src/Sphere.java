import static java.lang.Math.PI;

public class Sphere {
    private double r;
    final private String name = "Kula";

    public double getR() {
        return r;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double objetosc(double r){
        return (double) 4/3 * PI * r * r * r;
    }
    public double pole(double r){
        return 4*PI*r*r;
    }

    public void view(){
        System.out.println("Figura "+ name+" promień: "+r+" Pole kuli: "+ pole(r)+" objetosc koła"+objetosc(r));
    }
    public void view1(){
        System.out.format("Figura %s, promień r = %.2f, pole = %.2f, objetosc = %.2f", name, r, pole(r),objetosc(r));
    }
}
