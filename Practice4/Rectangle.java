package Practice4;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle(int position, Color color, int width, int height){
        super(position, color);
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle at position " + position + " with color " + color + ", width " + width + " and height " + height);
    }
}
