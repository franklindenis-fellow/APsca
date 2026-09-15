import java.util.Scanner;
public class onea {
    public static void main(String[] args) throws Exception {
        //program 1
        Scanner yes = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name = yes.nextLine();
        System.out.println("Hello, " + name + " welcome to APSCA");
        System.out.println("-thats it for program 1-");
        //program 2
        System.out.println("give me one name");
        String name1 = yes.nextLine();
        System.out.println("give me name 2");
        String name2 = yes.nextLine();
        System.out.println("give me name 3");
        String name3 = yes.nextLine();
        System.out.println(name3 + " " + name2 + " and " + name1 + " are your names backwards");
        System.out.println("-thats it for program 2-");
        //program 3
        System.out.println("how much do you weigh in pounds");
        int weight = yes.nextInt();
        System.out.println("you would weigh " + weight * 0.4 + " pounds on mercury");
        System.out.println("you would weigh " + weight * 0.9 + " pounds on venus");
        System.out.println("you would weigh " + weight * 0.38 + " pounds on mars");
        System.out.println("you would weigh " + weight * 2.3 + " pounds on jupiter");
        System.out.println("you would weigh " + weight * 1.1 + " pounds on saturn");
        System.out.println("you would weigh " + weight * 0.92 + " pounds on uranus");
        System.out.println("you would weigh " + weight * 1.2 + " pounds on neptune");
        System.out.println("-thats it for program 3-");
        //program 4
        System.out.println("give me a number of seconds");
        int seconds = yes.nextInt();
        int minutes = seconds/60;
        int hours = minutes/60;
        int seconds2 = seconds % 60;
        int minutes2 = minutes % 60;
        System.out.println(seconds + " seconds is equal to " + hours + " hours, " + minutes2 + " minutes, and " + seconds2 + " seconds");
        System.out.println("-thats it for program 4 and all the programs-");




    }
}
