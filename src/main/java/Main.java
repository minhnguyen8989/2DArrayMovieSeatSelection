import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row number (0-2): ");
        int inputRow = sc.nextInt();
        System.out.print("Enter the column number (0-6): ");
        int inputCol = sc.nextInt();

        // 1 = Available, 0 = NOT Available
        int seats[][] = {    {1,1,0,1,0,0,1},  //row 0
                            {0,1,1,0,0,1,0},  //row 1
                            {1,1,1,0,1,0,1}}; //row 2
                       //Col:0-1-2-3-4-5-6

        if (inputRow < 0 || inputRow >= seats.length || inputCol < 0 || inputCol >= seats[0].length) {
            System.out.println("Invalid seat selection! Please enter a valid row and column.");
        } else {
            // Check if the seat is available
            if (seats[inputRow][inputCol] == 1) {
                System.out.println("Seat is AVAILABLE.");
            } else {
                System.out.println("Seat is NOT AVAILABLE.");
            }
        }
    }
}

