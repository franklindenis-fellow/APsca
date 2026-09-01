import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double a = 5.4;
        boolean awesome = false;
        int b = 67;
        char s = 'h';
        System.out.println(a);
        System.out.println(awesome);
        System.out.println(b);
        System.out.println(s);
        System.out.println(a * b);
        Scanner tungtungtungsahur = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = tungtungtungsahur.nextLine();
        System.out.println("hello: " +userName);
        //get fav number low key on some tuff method
        System.out.println ("tell me your favorite number");
        int favoriteNumber = tungtungtungsahur.nextInt();
        System.out.println(favoriteNumber + " is your favorite number");
        System.out.println("enter your gpa");
        double gpa = tungtungtungsahur.nextDouble();
        System.out.println(gpa + " is your gpa on some einstein stuff");

        tungtungtungsahur.nextLine();
        System.out.println("whats your favotite word");
        String favoriteWord = tungtungtungsahur.nextLine();
        System.out.println(favoriteWord + " is your favorite word");
        

    }
}
