package Practice4;

public class Triangle extends Shape{
    public int base;
    public int height;

    public Triangle(int position, Color color, int base, int height){
        super(position, color);
        this.base = base;
        this.height = height;
    }

    public void draw(){
        System.out.println("Drawing a Triangle at position " + position + " with color " + color + ", base " + base + " and height " + height);
    }
}
