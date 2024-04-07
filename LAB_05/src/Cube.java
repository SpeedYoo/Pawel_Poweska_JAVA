public class Cube {
    private double a;
    final private String name = "Sześcian";

    public double objetosc(double a){
        return a*a*a;
    }
    public double pole(double a){
        return a*a*6;
    }
    public void view(){
        System.out.println("Figura "+ name+" długość boku: "+a+" objetosc: "+ objetosc(a));
    }
    public void view1(){
        System.out.format("Figura %s, długość a = %.2f, objetosc = %.2f, pole = %.2f \n", name, a, objetosc(a),pole(a));
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

}
