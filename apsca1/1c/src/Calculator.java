public class Calculator {
    private double num1;
    private double num2;
    public Calculator(double x, double y){
        num1=x;
        num2=y;
    }
    public Calculator(){
        num1=0;
        num2=0;
    }
    public double addNums(double x, double y){
        num1 = x;
        num2 = y;
        return num1 + num2;
    }
    public double subtractNums(double x, double y){
        num1 = x;
        num2 = y;
        return num1 - num2;
    }
    public double multiplyNums(double x, double y){
        num1 = x;
        num2 = y;
        return num1 * num2;
    }
    public double divideNums(double x, double y){
        num1 = x;
        num2 = y;
        return num1 / num2;
    }
    public double powerNums(double x, double y){
        num1 = x;
        num2 = y;
        return Math.pow(num1,num2);
    }
    public double absdistance(double x, double y){
        num1 = x;
        num2 = y;
        return Math.abs(num1 - num2);
    }
    public double sqrtofsum(double x, double y){
        num1 = x;
        num2 = y;
        return Math.sqrt(num1 + num2);
    }
    public double randombetweennums(double x, double y){
        num1 = x;
        num2 = y;
        return (int)(Math.random()*(num2-num1+1)+num1);
    }



    
}
