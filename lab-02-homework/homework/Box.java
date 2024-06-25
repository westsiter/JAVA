public class Box {
private int height;
private int width;

int getHeight(){
    return height;
}
int getWidth(){
    return width;
}

public Box(int h, int w){
    height = h;
    width = w;
}
public static Box joinDiagonal(Box p1 , Box p2){
    return new Box(p1.height + p2.height, p1.width + p2.width);
}
    public static Box joinHorizontal(Box p1 , Box p2){
    return new Box(Math.max(p1.height, p2.height), p1.width + p2.width);
    }
    public static Box joinVertical(Box p1 , Box p2){
        return new Box(p1.height + p2.height, Math.max(p1.width, p2.width));
    }
}
