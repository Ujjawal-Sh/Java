import java.util.ArrayList;

public class ArrayListCode {
    public static void main(String args[]) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("Orange");
        System.out.print(color);
        color.remove(1);
        System.out.println(color);
    }
}
