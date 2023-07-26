package mainroom.managementroom;

import java.util.Scanner;

public class ExitProgram {

    public static int exit() {

        Scanner read = new Scanner(System.in);
        int x = 0;

        System.out.println("\nDo you want to Exit?\n1. Yes\n2. No");
        System.out.print("Insert option: ");
        try {
            x = read.nextInt();
            switch(x) {
                case 1 :
                    break;
                case 2 :
                    break;
                default :
                    System.out.println("Invalid option!");
                    exit();
            }
        } catch(Exception e) {
            System.out.println("Please insert accurate option (insert option number.)");
            exit();
        }

        return x;
    }
}
