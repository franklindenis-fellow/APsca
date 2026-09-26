public class Rectangle {
    private int length;
    private int width;
    public Rectangle(){
        length = 0;
        width = 0;
    }
    public Rectangle(int x, int y){
        length = x;
        width = y;
    }

    public double calcArea(){
            return length*width;
    }
    public double calcPerimeter(){
        return 2*length + 2*width;
    }
    //getters and setters
    public int getlength(){
     return length;
     }
     public void setLength(int l){
        if(l>0)
        length = l;
     }
     public int getwidth(){
        return width;
     }
     public void setWidth(int w){
        if(w>0)
        width = w;
     }
     public String toString(){
        return "length is: " + length + " width is: " + width;
     }
    }

