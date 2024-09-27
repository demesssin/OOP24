package Tasks2;

public class StarTriangle {
    public int width;

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder triangle = new StringBuilder();

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                triangle.append("[*]");
            }
            triangle.append("\n");
        }
        return triangle.toString();
    }

    public static void main(String[] args) {
        StarTriangle tr = new StarTriangle();
        System.out.println();
    }
}
