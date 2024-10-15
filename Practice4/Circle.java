package Practice4;

class Circle extends Shape {
    public int radius;

    public Circle(int position, Color color, int radius){
        super(position, color);
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing circle at position: " + position + ", with radius: " + radius + " and color: " + color);
    }

}
