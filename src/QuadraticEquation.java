public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation() {

    }
    public QuadraticEquation(double a,double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b,2)-4*a*c;

    }
    public double getRoot1() {
        return ((-b+Math.sqrt(getDiscriminant()))/(2*a));
    }
    public double getRoot2() {
        return ((-b-Math.sqrt(getDiscriminant()))/(2*a));
    }



}
