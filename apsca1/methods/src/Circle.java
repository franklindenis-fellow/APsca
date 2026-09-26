public class Circle {
    private double radius;

    public Circle(){
        radius = 0;
    
    }
    public Circle(int x){
        radius = x;
    }
    public double calcArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    public int getRadius(){
        return (int) radius;
    }
     public void setRadius(int r){
        if(r>0)
        radius = r;
}
 public String toString(){
        return "radius is: " + radius;
     }
}
