package PassingObjectsAssignment;

public class Box {
    int width;
    int height;

    Box(int w, int h){
         width = w;
         height = h;
    }

    Box(Box b){
        this.width = b.width;
        this.height = b.height;
    }

    boolean isEqual(Box b){
        return this.width == b.width && this.height == b.height;
    }

    Box duplicate(){
        Box temp = new Box(this.width, this.height);
        return temp;
    }

    static boolean isTwoObjectsEqual(Box b1, Box b2){
        return b1.width == b2.width && b1.height == b2.height;
    }

    void display(){
        System.out.println("Width is " + this.width + " and height is " + this.height);
    }
}
