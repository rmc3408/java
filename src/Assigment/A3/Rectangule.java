package Assigment.A3;


public class Rectangule {
    
    protected double width = 1;
    protected double length = 1;

    public Rectangule(double w, double l)
    {
        this.length = l;
        this.width = w;
        System.out.printf("Rectangle Object created");
    }

    // get methods
    public double length(){
        return length;
    }
    public double width(){
        return width;
    }

    // set methods
    public void length(double len){
        if (len > 20 && len < 0) {
            throw new IllegalArgumentException("Out of range");
        }
        this.length = len;
    }
    public void width(double wid){
        if (wid > 20 && wid < 0) {
            throw new IllegalArgumentException("Out of range");
        }
        this.width = wid;
    }
    public void calcPerimeter(){
        
        double peri;
        peri = 2 * (length() + width());
        System.out.println(peri);

    }
    public void calcArea(){
        
        double area;
        area = length() * width();
        System.out.println(area);

    }
    

}