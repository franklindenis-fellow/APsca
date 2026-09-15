import java.util.Scanner;
public class oneb {
    public static void main(String[] args) throws Exception {
       Scanner answer = new Scanner(System.in);
       System.out.println("Give me a day of the week");
       String day = answer.nextLine();
       System.out.println("Give me a name");
       String name = answer.nextLine();   
       System.out.println("Give me an adjective");
       String adjective = answer.nextLine();
       System.out.println("Give me a verb");
       String verb = answer.nextLine();
       System.out.println("Give me a noun");
       String noun = answer.nextLine();
       System.out.println("Give me an adverb");
       String adverb = answer.nextLine();
       System.out.println("Give me a type of weather(adjective)");
       String weather = answer.nextLine();
       System.out.println("Give me a proper noun");
       String propernoun = answer.nextLine();
       System.out.println("It was a " + weather + " " + day + " and " +name + " was " + verb + "ing, when they saw a " + noun + ". They decided to " + adverb + " run from the " + adjective + " " + noun + ", and wished they had encountered " + propernoun + " instead.");





    }
}
