
public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        Shape regA = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + regA.getArea());

        Shape regB = new Square(5);
        System.out.println("====   Square  ====");
        System.out.println("Width = " + regB.getSide());
        System.out.println("Height = " + regB.getSide());
        System.out.println("Area = " + regB.getArea());
    }
}
