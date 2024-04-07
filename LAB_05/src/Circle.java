import static java.lang.Math.*;

public class Circle {
    private double r;
    final private String name = "koło";

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double pole(double r){
        return PI * Math.pow(r,2);
    }
    public double obwod(double r){
        return 2 * PI * r;
    }
    public void view(){
        System.out.println("Figura "+ name+" promień: "+r+" Pole koła: "+ pole(r)+" Obwód koła"+ obwod(r));
    }
    public void view1(){
        System.out.format("Figura %s, promień r = %.2f, pole = %.2f, obwód = %.2f", name, r, pole(r),obwod(r));
    }
}
