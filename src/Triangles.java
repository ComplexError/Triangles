import java.util.Scanner;
public class Triangles {
    public static String TriangleFill(Character fill) {
        System.out.printf(fill + " ");
        return;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String again = "y";

        //while (again == "y") {}

        System.out.println("How large would you like your triangle (1 to 50)");
        int size = in.nextInt();

        if (size > 0 && size < 50) {
            System.out.println("What character would you like your triangle to be made of?");
            Character fill = in.next().charAt(0);
            TriangleFill(fill);
            int i = 0;
            while (i <= size) {
                System.out.printf(TriangleFill);
                i++;
            }
        }
    }
}