import java.util.Scanner;
public class onec {
    public static void main(String[] args) throws Exception {
     
    Scanner inputs = new Scanner(System.in);
    System.out.println("Give me a number");
    int one = inputs.nextInt();
    System.out.println("Give me another number");
    int two = inputs.nextInt();
    Calculator calc = new Calculator(one,two);
    System.out.println("Sum is: " + calc.addNums(one,two));
    System.out.println("Difference is: " + calc.subtractNums(one,two));
    System.out.println("Product is: " + calc.multiplyNums(one,two));
    System.out.println("Quotient is: " + calc.divideNums(one,two));
    System.out.println("Power is: " + calc.powerNums(one,two));
    System.out.println("Random number between is: " + calc.randombetweennums(one,two));
    System.out.println("Absolute distance is: " + calc.absdistance(one,two));
    inputs.nextLine();
    System.out.println("Give me a word");
    String string1 = inputs.nextLine();
    System.out.println("Give me another word");
    String string2 = inputs.nextLine();
    StringManip special = new StringManip(string1, string2);
    System.out.println("Combined strings are: " + special.combineStrings());
    System.out.println("Combined length is: " + special.getCombinedLength());
    System.out.println("First half is: " + special.stringFirstHalf());
    System.out.println("Index of first letter is: " + special.indexOfFirstLetter());
    System.out.println("Swapped halves are: " + special.swapFirstAndSecondHalf());



    }
}
