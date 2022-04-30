import java.util.Scanner;
public class ex21_06 {

    public static void main(String[] args) {

        //declarations
        int[] myArray = new int[100];
        int input = 5;
        Scanner keyboard = new Scanner(System.in);

        //input and processing
        System.out.println("Please enter integers between 1 and 100 (enter 0 to stop): ");
        while (input != 0) {

            input = keyboard.nextInt();

            for (int i = 0; i < myArray.length; i++) {
                if (input == i) {
                    myArray[i] = input;
                }
            }

        }

        //output (This is where I need help!!!!)
        for (int k = 0; k < myArray.length; k++) {
            if (myArray[k] != 0) {

                System.out.print(k + " occurs " + myArray[k] + " time");
                if (myArray[k] > 1) {
                    System.out.println("s");
                } else
                    System.out.println();

            }
        }
        keyboard.close();
    }
}
