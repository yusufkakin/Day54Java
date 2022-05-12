package PassingObjectsAssignment;

public class Tutorials {
    public static void main(String[] args) {

        Box b1 = new Box(10, 20);
        Box b2 = new Box(20, 30);
        Box b3 = new Box(b1);

        Box b4 = b2.duplicate();

        b1.display();
        b3.display();

        b2.display();
        b4.display();

        System.out.println(b1.isEqual(b2) ? "Both b1 and b2 are equal" : "Both b1 and b2 are not equal");
        System.out.println(Box.isTwoObjectsEqual(b1, b2) ? "Both b1 and b2 are equal" : "Both b1 and b2 are not equal");
    }

}
