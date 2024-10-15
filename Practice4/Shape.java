package Practice4;

abstract class Shape {
    public int position;
    public Color color;

    public Shape(int position, Color color){
        this.position = position;
        this.color = color;
    }

    abstract void draw();

}
