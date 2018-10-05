import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.println("nhap a:");
        a=Double.parseDouble(sc.nextLine());
        System.out.println("nhap b:");
        b=Double.parseDouble(sc.nextLine());
        System.out.println("nhap c:");
        c=Double.parseDouble(sc.nextLine());


        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()<0) {
            System.out.println("phuong trinh vo nghiem");

        }else if(quadraticEquation.getDiscriminant()==0) {
            System.out.println("phuong trinh co nghiem kep :" + quadraticEquation.getRoot1());
        }else {
            System.out.println("phuong trinh co 2 nghiem :" + "x1=" +quadraticEquation.getRoot1() + " "+ "x2=" + quadraticEquation.getRoot2());
        }

    }

}
