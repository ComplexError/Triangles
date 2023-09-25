import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //creates loop for infinite triangles at the user's discretion
        String playAgain = "y";
        while (playAgain.equals("y")) {
            //method does all the work
            makeTriangle();

            //asks if user wants to keep making triangles
            System.out.println("Do you want to make another triangle (y/n)?");
            playAgain = in.nextLine();
        }
    }
    public static int makeTriangle() {
        //initializes scanner inside makeTriangle method
        Scanner in = new Scanner(System.in);

        //asks user for size
        System.out.println("Enter Size:");
        int size = in.nextInt();

        //loops if user does not input accepted parameter for size
        int isTrue = 0;
        while (isTrue == 0) {
            if (size < 1 || size > 50) {
                System.out.println("The size must be within the range of 1 - 50");
                System.out.println("Enter Size:");
                size = in.nextInt();
            }
            else {
                isTrue = 1;
            }
        }

        //user fill prompt
        System.out.println("Enter Fill:");
        char fill = in.next().charAt(0);

        //initializes loop to build triable based off the size input
        int loop = 0;
        for (int a = 0; a < size; a++) {

            //creates empty space before the fill character
            for (int i = 0; i < (size - loop); i++) {
                System.out.print(" ");
            }

            //places fill character and space between following character
            for (int j = 0; j <= loop; j++) {
                System.out.print(fill + " ");
            }

            //sets up for another row
            System.out.println();
            loop++;
        }

        //makes empty line for aesthetics and exits method
        System.out.println();
        return 0;
    }
}