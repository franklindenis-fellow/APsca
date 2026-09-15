import java.util.Scanner;

public class methods {
    public static void sum(int fortnite, int hacks){
        System.out.println(fortnite + hacks);

    }
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        sum(x,y); //static
        sum(1,2);
        System.out.println(Math.pow(6,3)); //static not void in another file
        System.out.println((int)(Math.random()*26)+5);
       /*  Scanner input = new Scanner(System.in); */ //not static
       Rectangle r = new Rectangle(1,2);
       double w = r.calcArea();
       System.out.println(r.getlength());
       r.setLength(5);
       System.out.println(r.getlength());

    }
}