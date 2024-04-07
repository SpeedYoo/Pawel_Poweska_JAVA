public class Square {
    private double a;
    final private String name = "kwadrat";

    public double pole(double a){
        return a*a;
    }
    public double obwod(double a){
        return 4 * a;
    }
    public void view(){
        System.out.println("Figura "+ name+" długość boku: "+a+" Pole: "+ pole(a)+" Obwód koła"+ obwod(a));
    }
    public void view1(){
        System.out.format("Figura %s, długość a = %.2f, pole = %.2f, obwód = %.2f", name, a, pole(a),obwod(a));
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
